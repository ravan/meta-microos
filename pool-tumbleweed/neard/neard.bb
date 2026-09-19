SUMMARY = "NFC for Linux"
DESCRIPTION = "NFC support for Linux."
LICENSE = "GPL-2.0-only"

PV = "0.20"

RPM_NAME = "neard-0.20-1.3.aarch64.rpm"
RPM_HASH = "43b9ebb91108302bd771ba8bbe6ce9c148125a7e68e3cc36f332086ead84e99c833ee0c5d1db1f7ccce0c2e6a12477009ac30995da56dd80fdf4067df866e717"

RPROVIDES:${PN} += "config-neard \
neard"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
