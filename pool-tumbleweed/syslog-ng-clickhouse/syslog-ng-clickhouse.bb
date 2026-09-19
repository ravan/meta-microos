SUMMARY = "Clickhouse destination support for syslog-ng"
DESCRIPTION = "This package provides Clickhouse destination support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-clickhouse-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "1b503ca7509a9790372f6bdee1961419d57e9fa25b6f2f1986d90ba51e1a2ddb689e7d6c77ac532db708b4f2d6072695976b9f8101d251ce3bbe81058b1778e8"

RPROVIDES:${PN} += "syslog-ng-clickhouse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libc.so.6 \
libevtlog-4.12.so.0 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgrpc++.so.1.76 \
libgrpc-protos.so.0 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libsyslog-ng-4.12.so.0 \
syslog-ng \
syslog-ng-grpc"

inherit rpm
