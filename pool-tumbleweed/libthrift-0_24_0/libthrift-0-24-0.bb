SUMMARY = "C++ API for the Thrift software framework"
DESCRIPTION = "Shared library providing the C++ API for the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "libthrift-0_24_0-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "3ad1a16e3591952bc47fc917bcd4b5890d538048f5ceae11d7252adc7956819c0f77f7d46cc74e4ac405c76367e9d3cf522fafdd6a4f93d3df8694d00fc27599"

RPROVIDES:${PN} += "libthrift-0-24-0 \
libthrift-0.24.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
