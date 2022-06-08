SUMMARY = "Sycamore AVS Demo Image"
DESCRIPTION = "Amazon Voice Services (AVS) Image + NXP VoiceSeeker/VoiceSpot + Rivieh Sycamore demo"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit core-image

## Select Image Features
IMAGE_FEATURES += " \
    debug-tweaks \
    tools-profile \
    tools-sdk \
    package-management \
    splash \
    nfs-server \
    tools-debug \
    ssh-server-dropbear \
    tools-testapps \
    hwcodecs \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston', \
       bb.utils.contains('DISTRO_FEATURES',     'x11', 'x11-base x11-sato', \
                                                       '', d), d)} \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-tools-bluetooth \
    packagegroup-fsl-tools-audio \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    packagegroup-imx-isp \
    packagegroup-imx-security \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'weston-xwayland xterm', '', d)} \
    chromium-ozone-wayland \
"

EXTRA_IMAGE_FEATURES += "dev-pkgs tools-sdk"
IMAGE_INSTALL_append = " libtasn1"
IMAGE_INSTALL_append = " portaudio-v19"
IMAGE_INSTALL_append = " curl"
IMAGE_INSTALL_append = " nghttp2"
IMAGE_INSTALL_append = " mbedtls"
IMAGE_INSTALL_append = " python-flask"
IMAGE_INSTALL_append = " python-requests"
IMAGE_INSTALL_append = " git"
IMAGE_INSTALL_append = " flac"
IMAGE_INSTALL_append = " python-pip"
IMAGE_INSTALL_append = " cmake"
IMAGE_INSTALL_append = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xdotool', '', d)}"
IMAGE_INSTALL_append = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11vnc', '', d)}"
IMAGE_INSTALL_append = " avs-device-sdk"
IMAGE_INSTALL_append = " leddaemon"
IMAGE_INSTALL_append = " audiofront"
IMAGE_INSTALL_append = " wakewordnotify"
IMAGE_INSTALL_append = " pca-mod"
IMAGE_INSTALL_append = " tas5805-linux-driver"
IMAGE_INSTALL_append = " leds-is31fl3246"

LICENSE_FLAGS_WHITELIST = "commercial_gst-fluendo-mp3 \
                             commercial_gst-openmax \
                             commercial_gst-plugins-ugly \
                             commercial_gst-ffmpeg \
                             commercial_gstreamer1.0-libav \
                             commercial_lame \
                             commercial_libav \
                             commercial_libpostproc \
                             commercial_mplayer2 \
                             commercial_x264 \
                             commercial_libmad \
                             commercial_mpeg2dec \
                             commercial_qmmp \
                             oracle_java \
                             commercial \
                             "

export IMAGE_BASENAME = "sycamore-image"
IMAGE_NAME = "${IMAGE_BASENAME}-${MACHINE}"



KERNEL_DEVICETREE_append = " imx8mn-550p2-rev2.dtb"
