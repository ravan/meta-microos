SUMMARY = "Loki destination support for syslog-ng"
DESCRIPTION = "This package provides Loki destination support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-loki-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "59b624611832150b2f44b29de5856bb8fb431cc7b5e7b2409af3be45df4c7e2b4dc140896dcc7237acce8c2f88b9a22bbc622d2d73fbd0ddec58575fcdc1c6a9"

RPROVIDES:${PN} += "syslog-ng-loki"

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
