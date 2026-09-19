SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "36.1"

RPM_NAME = "libprotobuf36_1_0-36.1-1.1.aarch64.rpm"
RPM_HASH = "a28847d45b3d023b4ca715305ad755fd093d7e53c435c34ce898b14fab14a02111dabc6bab634e473d22f41a33ad472a6ee81700174edd257bcee7d17bae8968"

RPROVIDES:${PN} += "libprotobuf.so.36.1.0 \
libprotobuf36-1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
libabsl-cord-internal.so.2608.0.0 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-die-if-null.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-int128.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-conditions.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-statusor.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libabsl-time-zone.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libutf8-validity.so.36.1.0 \
libz.so.1"

inherit rpm
