SUMMARY = "Open implementation of SYCL for CPUs and GPUs"
DESCRIPTION = "AdaptiveCpp is an open implementation of SYCL and C++ standard parallelism \
for CPUs and GPUs from all vendors."
LICENSE = "BSD-2-Clause"

PV = "25.10.0"

RPM_NAME = "adaptivecpp-25.10.0-2.2.aarch64.rpm"
RPM_HASH = "5bfbdef8b27d1b7bcc0e1ff9c6476815ed7f4c7ea9582a2520627599bc1d1d6b21a8cccb4d5e3ec7a43ec8307b8b5f75f72c868840a08cd00f2422a1042ae412"

RPROVIDES:${PN} += "adaptivecpp"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libacpp-common.so \
libacpp-rt.so \
libc.so.6 \
libgcc-s.so.1 \
libllvm-to-backend.so \
libllvm-to-host.so \
libstdc++.so.6"

inherit rpm
