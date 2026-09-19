SUMMARY = "Google PubSub destination support for syslog-ng"
DESCRIPTION = "This package provides Google PubSub destination support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-pubsub-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "fe0138d0b419ae071754809a0095729e53fc4b07b22c312613ffff5756017a632ac159749d72b139c2f12d43368cabd06d8c0c4807f48403de298082cb15ee16"

RPROVIDES:${PN} += "syslog-ng-pubsub"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
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
