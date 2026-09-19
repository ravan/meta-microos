SUMMARY = "Python bindings for oneAPI Threading Building Blocks"
DESCRIPTION = "oneTBB (previously known as TBB) is a flexible C++ library that simplifies the \
work of adding parallelism to complex applications. The library lets you easily \
write parallel programs that take full advantage of the multi-core performance. \
oneTBB provides you with functions, interfaces, and classes to parallelize and \
scale the code. \
 \
This package contains python 3.13 bindings for oneTBB."
LICENSE = "Apache-2.0"

PV = "2023.0.0"

RPM_NAME = "python313-tbb-2023.0.0-1.3.aarch64.rpm"
RPM_HASH = "320616e79ed6de172fa06f486532ee12c767c2c0f9b48fb72d338e58c464db9eb5a639f0b0f0b5f6610daa5d477e20a279b369a1f8a0149418b264421331af07"

RPROVIDES:${PN} += "python3-tbb \
python3.13dist-tbb \
python313-tbb \
python3dist-tbb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libirml1 \
libstdc++.so.6 \
libtbb.so.12 \
python-abi"

inherit rpm
