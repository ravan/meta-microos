SUMMARY = "Abseil library liblibabsl_log_internal_check_op"
DESCRIPTION = "This package contains the libabsl_log_internal_check_op library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_internal_check_op2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "747cca671302a6b9a2d98af4ac010d2c20b553d188150d7661d3d5aed47bfa1b8c2900a299ec7dc479c86855b9797f557a450286c90b21b7e621eed97cbe78de"

RPROVIDES:${PN} += "libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-check-op2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-leak-check.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
