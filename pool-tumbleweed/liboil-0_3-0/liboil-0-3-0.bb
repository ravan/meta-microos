SUMMARY = "Library of Optimized Inner Loops"
DESCRIPTION = "Liboil is a library of functions that are optimized for various \
CPUs. These functions are generally loops implementing \
algorithms, such as converting an array of N integers to floating-point \
numbers or multiplying and summing an array of N numbers. Such \
functions are candidates for significant optimization using various \
techniques, especially by using extended instructions provided by \
modern CPUs (Altivec, MMX, SSE, etc.)."
LICENSE = "BSD-2-Clause"

PV = "0.3.17"

RPM_NAME = "liboil-0_3-0-0.3.17-26.18.aarch64.rpm"
RPM_HASH = "4890ced5d93dfcaf5d51e95b8fb17d52b84174c0a36038e44d2b499f3e1955b0eb56a403fce55247baf19297649d0467be260b29b33776c77cd6f57d49dcdfd6"

RPROVIDES:${PN} += "liboil-0-3-0 \
liboil-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
