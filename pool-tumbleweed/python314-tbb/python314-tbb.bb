SUMMARY = "Python bindings for oneAPI Threading Building Blocks"
DESCRIPTION = "oneTBB (previously known as TBB) is a flexible C++ library that simplifies the \
work of adding parallelism to complex applications. The library lets you easily \
write parallel programs that take full advantage of the multi-core performance. \
oneTBB provides you with functions, interfaces, and classes to parallelize and \
scale the code. \
 \
This package contains python 3.14 bindings for oneTBB."
LICENSE = "Apache-2.0"

PV = "2023.0.0"

RPM_NAME = "python314-tbb-2023.0.0-1.3.aarch64.rpm"
RPM_HASH = "609f21fa9ac5cb9d5124a44cebb1cc2c18f1f04eaa16d4a6aea6d45f33a91624a2f189e22b7c80c19d4fe9041c87564e3598d1498cf262afb4fdc5f30a816c99"

RPROVIDES:${PN} += "python3.14dist-tbb \
python314-tbb \
python3dist-tbb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libirml1 \
libstdc++.so.6 \
libtbb.so.12 \
python-abi"

inherit rpm
