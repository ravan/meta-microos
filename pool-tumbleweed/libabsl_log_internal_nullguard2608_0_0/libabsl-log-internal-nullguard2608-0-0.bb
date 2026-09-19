SUMMARY = "Abseil library liblibabsl_log_internal_nullguard"
DESCRIPTION = "This package contains the libabsl_log_internal_nullguard library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_internal_nullguard2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "d19e4d2ffd93953c7144eddb729c10bd46ea8f51372cb156e2254e37240e6cc1678b7eb4c2056401f1dc491bd2bc9de434e2820d559cd291611d71bbcd2f1c88"

RPROVIDES:${PN} += "libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-log-internal-nullguard2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
