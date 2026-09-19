SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.76.0"

RPM_NAME = "libgrpc++1_76-1.76.0-3.12.aarch64.rpm"
RPM_HASH = "baf9495787eb6a55e86b07ec48ace63be16721d9346e201edb379659e25cf084fb674650dadf1a2fecd2eaf6d9840da0ad28b827b1c9d6252dd3e4f89b19ccb3"

RPROVIDES:${PN} += "libgrpc++-alts.so.1.76 \
libgrpc++-error-details.so.1.76 \
libgrpc++-reflection.so.1.76 \
libgrpc++-unsecure.so.1.76 \
libgrpc++.so.1.76 \
libgrpc++1-76 \
libgrpcpp-channelz.so.1.76"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-functions.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-statusor.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-vlog-config-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libgpr.so.51 \
libgrpc-unsecure.so.51 \
libgrpc.so.51 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libupb-hash-lib.so.51 \
libupb-mem-lib.so.51 \
libupb-message-lib.so.51 \
libupb-wire-lib.so.51 \
libutf8-validity.so.36.1.0"

inherit rpm
