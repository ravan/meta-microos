SUMMARY = "Abseil library liblibabsl_flags_usage_internal"
DESCRIPTION = "This package contains the libabsl_flags_usage_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_usage_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "659a7dc5a16e63e9fa9f8179bd2d738497a55bb1ae58aa096e32e8e934b8e18d96158cfce244c74df2192d123507e4311c8a990380a659c8ace97cd08a1fe2cf"

RPROVIDES:${PN} += "libabsl-flags-usage-internal.so.2608.0.0 \
libabsl-flags-usage-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-flags-config.so.2608.0.0 \
libabsl-flags-internal.so.2608.0.0 \
libabsl-flags-program-name.so.2608.0.0 \
libabsl-flags-reflection.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
