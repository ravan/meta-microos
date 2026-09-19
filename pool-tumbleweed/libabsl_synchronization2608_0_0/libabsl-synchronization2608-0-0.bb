SUMMARY = "Abseil library liblibabsl_synchronization"
DESCRIPTION = "This package contains the libabsl_synchronization library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_synchronization2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "719b0cf24daaf7108ee528b6da1f9670b0cf1486162f81f3dca5f990dd921500bb19ed6c58049c7eca84fb55f2aa43f60cc8d0a8b72fbb23d0c76d5c7b072a49"

RPROVIDES:${PN} += "libabsl-synchronization.so.2608.0.0 \
libabsl-synchronization2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
libabsl-kernel-timeout-internal.so.2608.0.0 \
libabsl-malloc-internal.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libabsl-stacktrace.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libabsl-tracing-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
