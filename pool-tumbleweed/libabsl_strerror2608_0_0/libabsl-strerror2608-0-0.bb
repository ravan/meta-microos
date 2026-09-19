SUMMARY = "Abseil library liblibabsl_strerror"
DESCRIPTION = "This package contains the libabsl_strerror library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_strerror2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "fb4e85cd3f04b6825a2c0d5ac86d04e04fcdea7a89f989545406ea079dd898e3536d4be66523c1e10483861b11c9372d3f5a76ae8476a75c581ed1900c7cedf8"

RPROVIDES:${PN} += "libabsl-strerror.so.2608.0.0 \
libabsl-strerror2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
