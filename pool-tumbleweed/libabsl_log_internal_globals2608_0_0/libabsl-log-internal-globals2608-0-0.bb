SUMMARY = "Abseil library liblibabsl_log_internal_globals"
DESCRIPTION = "This package contains the libabsl_log_internal_globals library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_internal_globals2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "be4b0254ecd9b6da4e7a4f4f9463c14c6f28a3039ce58a447d8cdd7fc07292929e89bd535f362b5bd375f8f76c247982688974f50976ac0aca96ffc0d90d2457"

RPROVIDES:${PN} += "libabsl-log-internal-globals.so.2608.0.0 \
libabsl-log-internal-globals2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-raw-logging-internal.so.2608.0.0 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
