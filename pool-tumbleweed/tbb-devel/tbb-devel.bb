SUMMARY = "Development Files for oneAPI Threading Building Blocks (oneTBB)"
DESCRIPTION = "oneTBB (previously known as TBB) is a flexible C++ library that simplifies the \
work of adding parallelism to complex applications. The library lets you easily \
write parallel programs that take full advantage of the multi-core performance. \
oneTBB provides you with functions, interfaces, and classes to parallelize and \
scale the code. \
 \
This package contains the header files needed for development with oneTBB."
LICENSE = "Apache-2.0"

PV = "2023.0.0"

RPM_NAME = "tbb-devel-2023.0.0-1.3.aarch64.rpm"
RPM_HASH = "23855aa0614424ca2e05fbfc6841bad602039112723d1dfacf7ef124fdbfb87ca5358a59e4534bab9d99539eba69a229feaa97ae2c9d8f104d423e35d8be7db2"

RPROVIDES:${PN} += "cmake-TBB \
pkgconfig-tbb \
tbb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
c++-compiler \
libirml1 \
libtbb12 \
libtbbbind-2-5-3 \
libtbbmalloc2"

inherit rpm
