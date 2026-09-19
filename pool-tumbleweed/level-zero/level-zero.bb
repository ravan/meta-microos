SUMMARY = "oneAPI Level Zero Specification Headers and Loader"
DESCRIPTION = "The objective of the oneAPI Level-Zero Application Programming Interface (API) \
is to provide direct-to-metal interfaces to offload accelerator devices. Its \
programming interface can be tailored to any device needs and can be adapted to \
support broader set of languages features such as function pointers, virtual \
functions, unified memory, and I/O capabilities."
LICENSE = "MIT"

PV = "1.33.1"

RPM_NAME = "level-zero-1.33.1-1.1.aarch64.rpm"
RPM_HASH = "cdf7cbb438198e780e640a2766e2f9262555a8198c6618b008de7f6d8bb8ab22ec34e81407a4999cd805e395466cb4bc061a8550967d3f629643f459377f65dd"

RPROVIDES:${PN} += "level-zero \
libze-loader.so.1 \
libze-tracing-layer.so.1 \
libze-validation-layer.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
