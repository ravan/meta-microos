SUMMARY = "Header files of Intel Math Kernel Library"
DESCRIPTION = "Intel Math Kernel Library for Deep Neural Networks (Intel MKL-DNN) is an \
open-source performance library for deep-learning applications. The library \
accelerates deep-learning applications and frameworks on Intel architecture. \
Intel MKL-DNN contains vectorized and threaded building blocks that you can use \
to implement deep neural networks (DNN) with C and C++ interfaces. \
 \
This package only includes the benchmark utility including its input files."
LICENSE = "Apache-2.0"

PV = "3.7.3"

RPM_NAME = "benchdnn-3.7.3-2.1.aarch64.rpm"
RPM_HASH = "b511bbe8b8ed2d04f6b6320660a81d661310b73d00a7899c12a063426764687e522c9c4a147f85433eebb6b048e862ce6d498abd9d496b0907bed865e65551ce"

RPROVIDES:${PN} += "benchdnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnnl.so.3 \
libdnnl3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
