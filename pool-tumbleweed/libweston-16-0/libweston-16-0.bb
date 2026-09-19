SUMMARY = "The Weston compositor as a shared library"
DESCRIPTION = "The libweston library is intended for use by other compositor efforts \
(projects) that want to more easily utilize Weston's internal \
functionalities. Weston's own reference compositor also makes use of \
this."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "16.0.0"

RPM_NAME = "libweston-16-0-16.0.0-1.1.aarch64.rpm"
RPM_HASH = "fccdc5c2a3e8857eafdc400f0b7c1bf0d3141fd469e5a5b38681dd551141209dec59d307e8245e1c58d922f67fe5ff603d752e5e27c8feced09915badecc232a"

RPROVIDES:${PN} += "libweston-16-0 \
libweston-16.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libm.so.6 \
libpixman-1.so.0 \
libwayland-server.so.0 \
libweston-16 \
libxkbcommon.so.0"

inherit rpm
