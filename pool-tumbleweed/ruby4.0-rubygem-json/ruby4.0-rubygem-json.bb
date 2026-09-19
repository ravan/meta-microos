SUMMARY = "JSON Implementation for Ruby"
DESCRIPTION = "This is a JSON implementation as a Ruby extension in C."
LICENSE = "Ruby"

PV = "2.7.6"

RPM_NAME = "ruby4.0-rubygem-json-2.7.6-1.11.aarch64.rpm"
RPM_HASH = "8fb128b1e461c589e13233bca7a654917f6d7264e4e588181f363a033e254a4ac4fcd4d905524fd3649a476d4959df6ead16a7c3ead93140d3067cd4301254a1"

RPROVIDES:${PN} += "ruby4.0-rubygem-json \
rubygem-json \
rubygem-ruby-4.0.0-json \
rubygem-ruby-4.0.0-json-2 \
rubygem-ruby-4.0.0-json-2.7 \
rubygem-ruby-4.0.0-json-2.7.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
