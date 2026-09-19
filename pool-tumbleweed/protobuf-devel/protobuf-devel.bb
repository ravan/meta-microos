SUMMARY = "Header files, libraries and development documentation for protobuf"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "36.1"

RPM_NAME = "protobuf-devel-36.1-1.1.aarch64.rpm"
RPM_HASH = "9385271844688dac2b65f647a56065f058b022dbbb4986f8fb1e633fd8b339ee78e42228bdd8ccf7d45bbec30d3ca905c3e4eaa1e40940038478e817d1179a4d"

RPROVIDES:${PN} += "cmake-protobuf \
cmake-utf8-range \
libprotobuf-devel \
mvn-com.google.protobuf-protoc-exe-linux-aarch-64- \
pkgconfig-protobuf \
pkgconfig-protobuf-lite \
pkgconfig-upb \
pkgconfig-utf8-range \
protobuf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-log-initialize.so.2608.0.0 \
libabsl-log-internal-conditions.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-statusor.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-lite36-1-0 \
libprotobuf.so.36.1.0 \
libprotobuf36-1-0 \
libprotoc.so.36.1.0 \
libstdc++.so.6 \
libutf8-range-36-1-0 \
libutf8-range.so.36.1.0 \
libutf8-validity.so.36.1.0 \
pkgconfig-absl-absl-check \
pkgconfig-absl-absl-log \
pkgconfig-absl-algorithm \
pkgconfig-absl-base \
pkgconfig-absl-bind-front \
pkgconfig-absl-bits \
pkgconfig-absl-btree \
pkgconfig-absl-cleanup \
pkgconfig-absl-cord \
pkgconfig-absl-core-headers \
pkgconfig-absl-debugging \
pkgconfig-absl-die-if-null \
pkgconfig-absl-dynamic-annotations \
pkgconfig-absl-flags \
pkgconfig-absl-flat-hash-map \
pkgconfig-absl-flat-hash-set \
pkgconfig-absl-function-ref \
pkgconfig-absl-hash \
pkgconfig-absl-layout \
pkgconfig-absl-log-globals \
pkgconfig-absl-log-initialize \
pkgconfig-absl-log-severity \
pkgconfig-absl-memory \
pkgconfig-absl-node-hash-map \
pkgconfig-absl-node-hash-set \
pkgconfig-absl-optional \
pkgconfig-absl-random-distributions \
pkgconfig-absl-random-random \
pkgconfig-absl-span \
pkgconfig-absl-status \
pkgconfig-absl-statusor \
pkgconfig-absl-strings \
pkgconfig-absl-synchronization \
pkgconfig-absl-time \
pkgconfig-absl-utility \
pkgconfig-utf8-range"

inherit rpm
