SUMMARY = "GRPC system in Ruby"
DESCRIPTION = "Send RPCs from Ruby using GRPC."
LICENSE = "Apache-2.0"

PV = "1.70.1"

RPM_NAME = "ruby4.0-rubygem-grpc-1.70.1-1.13.aarch64.rpm"
RPM_HASH = "485be5ecbe2259d9945646c60ba06350fde8804a3469667de929e5f335ad38cd9036b4d1bb07cb74a727f342b88c2b66d06316f893353219eac2bf1852c5db9a"

RPROVIDES:${PN} += "ruby4.0-rubygem-grpc \
rubygem-grpc \
rubygem-ruby-4.0.0-grpc \
rubygem-ruby-4.0.0-grpc-1 \
rubygem-ruby-4.0.0-grpc-1.70 \
rubygem-ruby-4.0.0-grpc-1.70.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
/usr/bin/sh \
ca-certificates-mozilla \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgrpc.so.51 \
libm.so.6 \
libruby4.0.so.4.0 \
libstdc++.so.6 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-ruby-4.0.0-google-protobuf \
rubygem-ruby-4.0.0-googleapis-common-protos-types-1"

inherit rpm
