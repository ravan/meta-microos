SUMMARY = "Common files for grpc-based syslog-ng drivers"
DESCRIPTION = "This package provides provides common files for grpc-based syslog-ng drivers"
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-grpc-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "f3c96ea8716841c644426f67146ad77338ae11eeff49d19397959d666e5cd035c13bca5c361458ece9ab9496614159c4066be1d1e2c49b0b90c9df68340ffc16"

RPROVIDES:${PN} += "libgrpc-protos.so.0 \
syslog-ng-grpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-functions.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libgpr.so.51 \
libgrpc++.so.1.76 \
libgrpc.so.51 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libsyslog-ng-4.12.so.0 \
libutf8-range.so.36.1.0 \
syslog-ng"

inherit rpm
