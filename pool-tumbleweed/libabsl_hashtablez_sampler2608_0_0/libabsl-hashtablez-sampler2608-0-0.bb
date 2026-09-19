SUMMARY = "Abseil library liblibabsl_hashtablez_sampler"
DESCRIPTION = "This package contains the libabsl_hashtablez_sampler library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_hashtablez_sampler2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "b6c4166b3ddbe799d1f73db3b798bf158d5aa338d2eea7767cec92d29c5a762ade9546c4d33e6d3c426d5bc0ccb818696864d8642146d15bd5203501dfc2e6ec"

RPROVIDES:${PN} += "libabsl-hashtablez-sampler.so.2608.0.0 \
libabsl-hashtablez-sampler2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-stacktrace.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
