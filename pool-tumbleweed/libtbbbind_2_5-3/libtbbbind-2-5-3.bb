SUMMARY = "NUMA support library for oneAPI Threading Building Blocks"
DESCRIPTION = "oneTBB (previously known as TBB) is a flexible C++ library that simplifies the \
work of adding parallelism to complex applications. The library lets you easily \
write parallel programs that take full advantage of the multi-core performance. \
oneTBB provides you with functions, interfaces, and classes to parallelize and \
scale the code. \
 \
The NUMA support library for oneTBB."
LICENSE = "Apache-2.0"

PV = "2023.0.0"

RPM_NAME = "libtbbbind_2_5-3-2023.0.0-1.3.aarch64.rpm"
RPM_HASH = "e866cbeb839619256ff51033dc7d846498ff1d227755c8345e497b10120f4a4bd469a193b48011a56e4c5569990d1e57f67a860d430d79cf59ff8071deb24c2a"

RPROVIDES:${PN} += "libtbbbind-2-5-3 \
libtbbbind-2-5.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhwloc.so.15 \
libstdc++.so.6"

inherit rpm
