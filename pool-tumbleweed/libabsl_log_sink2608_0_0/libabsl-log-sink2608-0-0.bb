SUMMARY = "Abseil library liblibabsl_log_sink"
DESCRIPTION = "This package contains the libabsl_log_sink library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_sink2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "9cbe9ce440d742f85b6b559b70cf187ad6853721f740c4abf98e17d783abde31f076d6701fc2e23ac84920d4b03efd8886aec4ef0590eb47a052f0080ad51ab8"

RPROVIDES:${PN} += "libabsl-log-sink.so.2608.0.0 \
libabsl-log-sink2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libstdc++.so.6"

inherit rpm
