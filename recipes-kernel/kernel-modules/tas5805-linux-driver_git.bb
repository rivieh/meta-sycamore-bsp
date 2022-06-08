# Recipe created by recipetool

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

SRC_URI = "git://git@github.com/rivieh/tas5805_linux_driver.git;protocol=ssh;branch=thomas-updates \
           file://0001-Tunned-Configration.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "4bdb0c0d4ab9053fc5b8f6f690f69afb7abb8699"

S = "${WORKDIR}/git"
