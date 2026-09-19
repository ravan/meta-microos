SUMMARY = "Header files of Intel Math Kernel Library"
DESCRIPTION = "Intel Math Kernel Library for Deep Neural Networks (Intel MKL-DNN) is an \
open-source performance library for deep-learning applications. The library \
accelerates deep-learning applications and frameworks on Intel architecture. \
Intel MKL-DNN contains vectorized and threaded building blocks that you can use \
to implement deep neural networks (DNN) with C and C++ interfaces."
LICENSE = "Apache-2.0"

PV = "3.7.3"

RPM_NAME = "libdnnl3-3.7.3-2.1.aarch64.rpm"
RPM_HASH = "9e528892c0d4a836be453c705ac84b88e42d1e94aa8274a61ca260467aece4557303ee36aa3fd25c3c77a6939a34b4720a20f2ededad1a1a03ca863e82599a56"

RPROVIDES:${PN} += "libdnnl.so.3 \
libdnnl3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
