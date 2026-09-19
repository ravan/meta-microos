SUMMARY = "Ruby C bindings to the excellent Yajl JSON stream-based parser"
DESCRIPTION = "Ruby C bindings to the excellent Yajl JSON stream-based parser library."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.4.3"

RPM_NAME = "ruby4.0-rubygem-yajl-ruby-1.4.3-1.21.aarch64.rpm"
RPM_HASH = "b3855a38447aeb9c02014981c8e83e9f01479b6f73a0a992308f3d87078936fea871c4294c6a474884bb76df5151bc1d9d8a8b2994231f01b6ec391daaa658c7"

RPROVIDES:${PN} += "ruby4.0-rubygem-yajl-ruby \
rubygem-ruby-4.0.0-yajl-ruby \
rubygem-ruby-4.0.0-yajl-ruby-1 \
rubygem-ruby-4.0.0-yajl-ruby-1.4 \
rubygem-ruby-4.0.0-yajl-ruby-1.4.3 \
rubygem-yajl-ruby"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
