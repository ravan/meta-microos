SUMMARY = "NETGEN mesher core library"
DESCRIPTION = "NETGEN mesh generator core shared library."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2602"

RPM_NAME = "libngcore_6_2_2602-6.2.2602-3.5.aarch64.rpm"
RPM_HASH = "abf2c26b66a546d3bf6106c3814bf426eab88d11c328e8933e0713bb28f488689db93eb523759115c4340d29ad536613250489f9c1b48f99830c79b904fce1c1"

RPROVIDES:${PN} += "libngcore-6-2-2602 \
libngcore.so.6.2.2602"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6"

inherit rpm
