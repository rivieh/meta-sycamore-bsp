FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI += "file://imx8mn-550p2-rev2.dts;subdir=git/arch/${ARCH}/boot/dts"

KERNEL_DEVICETREE_append = " imx8mn-550p2-rev2.dtb"
