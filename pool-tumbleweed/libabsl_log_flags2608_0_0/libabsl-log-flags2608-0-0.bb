SUMMARY = "Abseil library liblibabsl_log_flags"
DESCRIPTION = "This package contains the libabsl_log_flags library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_flags2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "ebaa470f98164f4b1e6e6527f0ed4837ae9702955e15f211bf27172b55aa070a0e56d3462d85506ddad875baa84567741433be3c3085e52c1f74ddc6e2e0dcd1"

RPROVIDES:${PN} += "libabsl-log-flags.so.2608.0.0 \
libabsl-log-flags2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-flags-internal.so.2608.0.0 \
libabsl-flags-marshalling.so.2608.0.0 \
libabsl-flags-reflection.so.2608.0.0 \
libabsl-log-globals.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-vlog-config-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
