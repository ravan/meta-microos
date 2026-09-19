SUMMARY = "Graph automorphism group computation with Nauty"
DESCRIPTION = "nauty and Traces are programs for computing automorphism groups of \
graphs and digraphs. They can also produce a canonical label."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "libnauty-2_9_3-2.9.3-1.5.aarch64.rpm"
RPM_HASH = "e216afbc264a3d4c97c4b3c2e7ea1312ab36bab8ac36036238e6e6dfbf49d4614b4e1034cdbf12481b165cd1e46f7c104feff64512e80fed035061c73e3835d0"

RPROVIDES:${PN} += "libnauty-2-9-3 \
libnauty-2.9.3.so \
libnautyA1-2.9.3.so \
libnautyL0-2.9.3.so \
libnautyL1-2.9.3.so \
libnautyQ0-2.9.3.so \
libnautyQ1-2.9.3.so \
libnautyS0-2.9.3.so \
libnautyS1-2.9.3.so \
libnautyW0-2.9.3.so \
libnautyW1-2.9.3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
