FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://Kconfig;subdir=git/board/rivieh/imx8mn-550p2-rev2 \           
            file://MAINTAINERS;subdir=git/board/rivieh/imx8mn-550p2-rev2 \
            file://Makefile;subdir=git/board/rivieh/imx8mn-550p2-rev2   \
            file://spl.c;subdir=git/board/rivieh/imx8mn-550p2-rev2  \
            file://README;subdir=git/board/rivieh/imx8mn-550p2-rev2 \
            file://ddr3l_timing.c;subdir=git/board/rivieh/imx8mn-550p2-rev2 \
            file://imx8mn-550p2-rev2.c;subdir=git/board/rivieh/imx8mn-550p2-rev2 \
            file://imx8mn-550p2-rev2.h;subdir=git/include/configs   \
            file://imx8mn-550p2-rev2_defconfig;subdir=git/configs   \
            file://0001-added-imx8mn-550p2-rev2-board-configration.patch \
            "

COMPATIBLE_MACHINE = "(imx8|imx8mn-550p2-rev2)"


