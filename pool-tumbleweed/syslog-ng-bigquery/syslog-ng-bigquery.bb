SUMMARY = "Google BigQuery destination support for syslog-ng"
DESCRIPTION = "This package provides Google BigQuery destination support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-bigquery-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "5e405f674e56ba8549be7f79d68570294233b553ee146d4c46c4026569bc6122c38a082eac4563daeb397dfa45242cb15fc6881952471ac274e8df2fb8d9caaf"

RPROVIDES:${PN} += "syslog-ng-bigquery"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-functions.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libevtlog-4.12.so.0 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgpr.so.51 \
libgrpc++.so.1.76 \
libgrpc-protos.so.0 \
libgrpc.so.51 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libsyslog-ng-4.12.so.0 \
syslog-ng \
syslog-ng-grpc"

inherit rpm
