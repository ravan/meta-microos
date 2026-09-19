SUMMARY = "X11 keyboard UI presentation library"
DESCRIPTION = "libxkbui provides an interface to easily present XKB layouts as \
graphical widgets."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libxkbui1-1.0.2-13.11.aarch64.rpm"
RPM_HASH = "8b63f556770369684d69e2443645e417c997e6bf7bd5b5cc52d24a8b50bdb1b58d118e3b836f232d56082f9da12b2f90270dcf4de3ef2346c75568f4721745c4"

RPROVIDES:${PN} += "libxkbui.so.1 \
libxkbui1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libxkbfile.so.1"

inherit rpm
