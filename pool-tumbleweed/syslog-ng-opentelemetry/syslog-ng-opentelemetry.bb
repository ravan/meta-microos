SUMMARY = "OpenTelemetry support for syslog-ng"
DESCRIPTION = "This package provides OpenTelemetry support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-opentelemetry-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "13a9f42ef3d8a45fb1c789941185280339d785326879145e8a83345bcf3808d7899074224c8015d1a1d22d61619a4def69fa072245bf2bc32ab8cb532d34cb59"

RPROVIDES:${PN} += "syslog-ng-opentelemetry"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-functions.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
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
