SUMMARY = "An efficient digital signature library providing the Ed25519"
DESCRIPTION = "A Ruby binding to the Ed25519 elliptic curve public-key signature system \
described in RFC 8032."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "ruby4.0-rubygem-ed25519-1.3.0-1.26.aarch64.rpm"
RPM_HASH = "81f21bd6d3bc90a9594c7d6042a70e407fe8cb20478c20e4351c9d7fd6487a3dd3dddd7c7a27c96b9889030f1f74fe11a6d1603de3f8f1c3701cfe6e112c2464"

RPROVIDES:${PN} += "ruby4.0-rubygem-ed25519 \
rubygem-ed25519 \
rubygem-ruby-4.0.0-ed25519 \
rubygem-ruby-4.0.0-ed25519-1 \
rubygem-ruby-4.0.0-ed25519-1.3 \
rubygem-ruby-4.0.0-ed25519-1.3.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
