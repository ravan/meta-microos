SUMMARY = "Abseil library liblibabsl_vlog_config_internal"
DESCRIPTION = "This package contains the libabsl_vlog_config_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_vlog_config_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "c09cf2f353a06b57bb9774568ff362c498e8a853ae9e0242d41b8b3f2180d263af866f8c05e5c44d86e13098707d0bcd712d86f44d73d1e22d436328ba1b1ea0"

RPROVIDES:${PN} += "libabsl-vlog-config-internal.so.2608.0.0 \
libabsl-vlog-config-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
libabsl-log-internal-fnmatch.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
