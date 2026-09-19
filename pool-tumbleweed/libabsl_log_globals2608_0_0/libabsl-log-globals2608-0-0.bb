SUMMARY = "Abseil library liblibabsl_log_globals"
DESCRIPTION = "This package contains the libabsl_log_globals library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_globals2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "dab2f63f218d1200aa7a183c85e9d9ec1c4ef5b94da1016eff416b9d51d411e238b8d3c0297bd7142f64c0f4ae4d3fc74f10da99de7c8ad92e805718ed858e65"

RPROVIDES:${PN} += "libabsl-log-globals.so.2608.0.0 \
libabsl-log-globals2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
