SUMMARY = "Boost.Python runtime library"
DESCRIPTION = "This package contains the Boost.Python runtime libraries for python3 \
bindings."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_python-py3-1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "00c5b1af34fb4aa811e93cf2edb00ef0a04e5bc85b2504d89820476f5bee4f61f3322c0e0f3508b3a7a7c24936f0676b84b854d777e785fc520b0bd8939be54f"

RPROVIDES:${PN} += "libboost-python-py3-1-91-0 \
libboost-python-py3.so.1.91.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
