SUMMARY = "a fast strptime/strftime engine"
DESCRIPTION = "a fast strptime/strftime engine which uses VM."
LICENSE = "BSD-2-Clause"

PV = "0.2.5"

RPM_NAME = "ruby4.0-rubygem-strptime-0.2.5-1.31.aarch64.rpm"
RPM_HASH = "11b4ca155cc19322ac2c3de3caae45b1b25787c4e4e9ed3d4516b5415b698bccb7536c30d96af1a9395ae6b0738e6a4bf59dfe93d19a2a7a1ca9a81b20ca234e"

RPROVIDES:${PN} += "ruby4.0-rubygem-strptime \
rubygem-ruby-4.0.0-strptime \
rubygem-ruby-4.0.0-strptime-0 \
rubygem-ruby-4.0.0-strptime-0.2 \
rubygem-ruby-4.0.0-strptime-0.2.5 \
rubygem-strptime"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
