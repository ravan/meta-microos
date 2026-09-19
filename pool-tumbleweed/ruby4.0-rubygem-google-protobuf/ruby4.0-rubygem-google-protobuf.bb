SUMMARY = "Protocol Buffers"
DESCRIPTION = "Protocol Buffers are Google's data interchange format."
LICENSE = "BSD-3-Clause"

PV = "3.25.2"

RPM_NAME = "ruby4.0-rubygem-google-protobuf-3.25.2-2.12.aarch64.rpm"
RPM_HASH = "546af8136bad7e5de1d3dda33fd4988ddfc2713d61574be305aff2141a057ebd4c221754aee44b166bb9aadfb040d8edab69d7ecfc6d2abdc64c5fbd704a7d3b"

RPROVIDES:${PN} += "ruby4.0-rubygem-google-protobuf \
rubygem-google-protobuf \
rubygem-ruby-4.0.0-google-protobuf \
rubygem-ruby-4.0.0-google-protobuf-3 \
rubygem-ruby-4.0.0-google-protobuf-3.25 \
rubygem-ruby-4.0.0-google-protobuf-3.25.2"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
