SUMMARY = "X Pixmap image file format library"
DESCRIPTION = "libXpm facilitates working with XPM (X PixMap), a format for \
storing/retrieving X pixmaps to/from files."
LICENSE = "MIT"

PV = "3.5.18"

RPM_NAME = "libXpm4-3.5.18-2.3.aarch64.rpm"
RPM_HASH = "1710ae15809b1a94c92291e07d4d42d3e6827e5aa4154bfe4f562bdada09413dcd8cefdc8d9d2a6d552a5d79bf055623b02f6c808faee19989f692010226f2ca"

RPROVIDES:${PN} += "libXpm.so.4 \
libXpm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/gzip \
/usr/bin/uncompress \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
