SUMMARY = "Abseil library liblibabsl_log_internal_log_sink_set"
DESCRIPTION = "This package contains the libabsl_log_internal_log_sink_set library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_internal_log_sink_set2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "57dbc56347b424a136b4d4bc7aef73739cc98afd107b7a60f5afda97f6483174cbc67841e08c1169710f558e211a67101e24a891db32d80c69a6ca87804730f3"

RPROVIDES:${PN} += "libabsl-log-internal-log-sink-set.so.2608.0.0 \
libabsl-log-internal-log-sink-set2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-log-globals.so.2608.0.0 \
libabsl-log-internal-globals.so.2608.0.0 \
libabsl-log-sink.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
