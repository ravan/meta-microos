SUMMARY = "Development files for libadaptivecpp"
DESCRIPTION = "AdaptiveCpp is an open implementation of SYCL and C++ standard parallelism \
for CPUs and GPUs from all vendors. \
 \
This package contains the development files for AdaptiveCpp."
LICENSE = "BSD-2-Clause"

PV = "25.10.0"

RPM_NAME = "adaptivecpp-devel-25.10.0-2.2.aarch64.rpm"
RPM_HASH = "8881ebfb51d746cf546bcf3a2f16efc365f397e01ab429c1cffe31ebea5ec29a8aa054e3089689249e6ab2fe62452b02eff4b7daa769d73d5112a357b05f1679"

RPROVIDES:${PN} += "adaptivecpp-devel \
cmake-adaptivecpp \
cmake-hipsycl \
cmake-opensycl"

RDEPENDS:${PN} += "/usr/bin/python3 \
adaptivecpp \
libacpp-clang"

inherit rpm
