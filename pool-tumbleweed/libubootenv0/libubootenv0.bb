SUMMARY = "Library to read and modify U-Boot environment"
DESCRIPTION = "Library to read and modify U-Boot environment."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.7"

RPM_NAME = "libubootenv0-0.3.7-1.3.aarch64.rpm"
RPM_HASH = "69e766dd4e3991bee02ec5039752845629bf956e920d9cbbaf3e3222c0247cd8361103b1cecc4aec52258cc3c2edfe5304c8fd706f77c4c2b074bde5c7072408"

RPROVIDES:${PN} += "libubootenv.so.0 \
libubootenv0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libyaml-0.so.2 \
libz.so.1"

inherit rpm
