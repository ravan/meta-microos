SUMMARY = "Python 3 bindings for libnbd"
DESCRIPTION = "python3-libnbd contains Python 3 bindings for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25.7"

RPM_NAME = "python3-libnbd-1.25.7-1.1.aarch64.rpm"
RPM_HASH = "4b0a13e2302155cf891c2396088e8ef96772a3e0d6099413d95cf1d2c265204a9c6c5d8939cf66bfb1440c72e5eda42ed4dac9caa00460cef6382c9ee95e5e14"

RPROVIDES:${PN} += "libnbdmod.cpython-313-aarch64-linux-gnu.so \
python3-libnbd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnbd.so.0 \
libnbd0 \
python-abi"

inherit rpm
