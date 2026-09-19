SUMMARY = "Memory allocator library for oneAPI Threading Building Blocks"
DESCRIPTION = "oneTBB (previously known as TBB) is a flexible C++ library that simplifies the \
work of adding parallelism to complex applications. The library lets you easily \
write parallel programs that take full advantage of the multi-core performance. \
oneTBB provides you with functions, interfaces, and classes to parallelize and \
scale the code. \
 \
This package provides the oneTBB memory allocator shared library."
LICENSE = "Apache-2.0"

PV = "2023.0.0"

RPM_NAME = "libtbbmalloc2-2023.0.0-1.3.aarch64.rpm"
RPM_HASH = "0679b884f0ebf1345666dfd8a19586fa2ccd93fd79ea0c99c56181eddf5fe150d647447b2e971ffc1cd81e76367a7035bdc065993c251e18aa905ec0388dacde"

RPROVIDES:${PN} += "libtbbmalloc-proxy.so.2 \
libtbbmalloc.so.2 \
libtbbmalloc2 \
tbb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
