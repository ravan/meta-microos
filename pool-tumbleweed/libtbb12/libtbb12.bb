SUMMARY = "Core library for oneAPI Threading Building Blocks"
DESCRIPTION = "oneTBB (previously known as TBB) is a flexible C++ library that simplifies the \
work of adding parallelism to complex applications. The library lets you easily \
write parallel programs that take full advantage of the multi-core performance. \
oneTBB provides you with functions, interfaces, and classes to parallelize and \
scale the code. \
 \
This package provides the core shared library corresponding to oneTBB."
LICENSE = "Apache-2.0"

PV = "2023.0.0"

RPM_NAME = "libtbb12-2023.0.0-1.3.aarch64.rpm"
RPM_HASH = "c13f22332e15e37a14d482789f04b01f4f0a0833fbbb0b36bdf3f9ed8393e36340c4611fb9086d7fc44b2d4bd8ccb0107121d8ba43baa4018019e9984677b10e"

RPROVIDES:${PN} += "libtbb.so.12 \
libtbb12 \
onetbb \
tbb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
