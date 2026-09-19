SUMMARY = "Development files for grpc, a HTTP/2 Remote Procedure Call implementation"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.76.0"

RPM_NAME = "grpc-devel-1.76.0-3.12.aarch64.rpm"
RPM_HASH = "ff93257ae5b69540a87d499304fc6d6a338344d80aaaa62c8aae601e1f0d7ef41262f2942c94cdd56b586f3f89296bf7a29371b108a9948b4c90dc38eaa8aab0"

RPROVIDES:${PN} += "cmake-gRPC \
grpc-devel \
pkgconfig-gpr \
pkgconfig-grpc \
pkgconfig-grpc++ \
pkgconfig-grpc++-unsecure \
pkgconfig-grpc-unsecure \
pkgconfig-grpcpp-otel-plugin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libgrpc++1-76 \
libgrpc-plugin-support.so.1.76 \
libgrpc1-76 \
libgrpc51 \
libprotobuf.so.36.1.0 \
libprotoc.so.36.1.0 \
libstdc++.so.6 \
libupb51 \
pkgconfig-absl-absl-check \
pkgconfig-absl-absl-log \
pkgconfig-absl-algorithm-container \
pkgconfig-absl-any-invocable \
pkgconfig-absl-base \
pkgconfig-absl-bind-front \
pkgconfig-absl-bits \
pkgconfig-absl-btree \
pkgconfig-absl-check \
pkgconfig-absl-cleanup \
pkgconfig-absl-config \
pkgconfig-absl-cord \
pkgconfig-absl-core-headers \
pkgconfig-absl-dynamic-annotations \
pkgconfig-absl-flags \
pkgconfig-absl-flags-marshalling \
pkgconfig-absl-flat-hash-map \
pkgconfig-absl-flat-hash-set \
pkgconfig-absl-function-ref \
pkgconfig-absl-hash \
pkgconfig-absl-inlined-vector \
pkgconfig-absl-layout \
pkgconfig-absl-log \
pkgconfig-absl-log-globals \
pkgconfig-absl-log-severity \
pkgconfig-absl-memory \
pkgconfig-absl-no-destructor \
pkgconfig-absl-node-hash-map \
pkgconfig-absl-optional \
pkgconfig-absl-prefetch \
pkgconfig-absl-random-bit-gen-ref \
pkgconfig-absl-random-distributions \
pkgconfig-absl-random-random \
pkgconfig-absl-span \
pkgconfig-absl-status \
pkgconfig-absl-statusor \
pkgconfig-absl-str-format \
pkgconfig-absl-string-view \
pkgconfig-absl-strings \
pkgconfig-absl-strings-internal \
pkgconfig-absl-synchronization \
pkgconfig-absl-time \
pkgconfig-absl-type-traits \
pkgconfig-absl-utility \
pkgconfig-gpr \
pkgconfig-grpc \
pkgconfig-grpc++ \
pkgconfig-grpc-unsecure \
pkgconfig-libcares \
pkgconfig-openssl \
pkgconfig-re2 \
pkgconfig-zlib"

inherit rpm
