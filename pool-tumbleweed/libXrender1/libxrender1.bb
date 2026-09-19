SUMMARY = "X Rendering Extension library"
DESCRIPTION = "The Xrender library is designed as a lightweight library interface to \
the Render extension."
LICENSE = "MIT"

PV = "0.9.12"

RPM_NAME = "libXrender1-0.9.12-1.7.aarch64.rpm"
RPM_HASH = "1e1f5ea369ae0d876e20af8522f5bf5bb1ce155e3d191f0db16f86467836cf143c9e0a9090fd88ef8028521fdf05dece0a162fca671cf1641908d817fa240b1a"

RPROVIDES:${PN} += "libXrender.so.1 \
libXrender1 \
xorg-x11-libXrender"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
