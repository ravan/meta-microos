SUMMARY = "Ghostview"
DESCRIPTION = "Ghostview offers an X11 GUI for viewing PostScript files. This is an \
X11 interface to ghostscript."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ghostview-1.5-449.5.aarch64.rpm"
RPM_HASH = "7353735fe7f7a4cf1fdfc63c615f4313c5d1c2487689b25206a0d72491a4ec474759dc2c22134da9f89f311c13d2bdf8cf2c03a9dfdfb6bb9a0611f4b7969dc1"

RPROVIDES:${PN} += "config-ghostview \
ghostview \
ghstview \
gsview"

RDEPENDS:${PN} += "ghostscript-x11 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
