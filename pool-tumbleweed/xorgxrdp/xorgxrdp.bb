SUMMARY = "Xorg drivers for xrdp"
DESCRIPTION = "This package contains Xorg driver modules for xrdp"
LICENSE = "X11"

PV = "0.10.5"

RPM_NAME = "xorgxrdp-0.10.5-1.2.aarch64.rpm"
RPM_HASH = "483e22eced6a9768526fbac1a7d247124df20731b2ba675ce0b21b0b2c6b2b9994f81494df630302bfe48d384404fa79093138c1ed81ad9c0729f1b2bb5b50da"

RPROVIDES:${PN} += "config-xorgxrdp \
libxorgxrdp.so \
xorgxrdp"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
xrdp"

inherit rpm
