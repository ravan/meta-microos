SUMMARY = "Abseil library liblibabsl_flags_parse"
DESCRIPTION = "This package contains the libabsl_flags_parse library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_parse2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "7a68e3bcab89e30ba4675dfb4689d05a1a4b0d77e6e844c25c8374939b3e601c9182970909d7cde96976aeef50580a68e8d84c01e5ae99b3492bcef6a59cf012"

RPROVIDES:${PN} += "libabsl-flags-parse.so.2608.0.0 \
libabsl-flags-parse2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-flags-config.so.2608.0.0 \
libabsl-flags-internal.so.2608.0.0 \
libabsl-flags-marshalling.so.2608.0.0 \
libabsl-flags-private-handle-accessor.so.2608.0.0 \
libabsl-flags-program-name.so.2608.0.0 \
libabsl-flags-reflection.so.2608.0.0 \
libabsl-flags-usage-internal.so.2608.0.0 \
libabsl-flags-usage.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
