SUMMARY = "Python bindings for libcamera"
DESCRIPTION = "Python bindings for libcamera."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "python3-libcamera-0.7.2-1.2.aarch64.rpm"
RPM_HASH = "ce4c898e636be390d62dae9b79b6e8edd6eacb889f7cc1c3b85ce9f8451a675a05edc600e4462aae6cef906c4acbfd7fc9ef49544a2decc382e2135e101fc722"

RPROVIDES:${PN} += "python3-libcamera"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcamera-base.so.0.7 \
libcamera.so.0.7 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
