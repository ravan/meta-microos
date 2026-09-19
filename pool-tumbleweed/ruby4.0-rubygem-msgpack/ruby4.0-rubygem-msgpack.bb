SUMMARY = "MessagePack, a binary-based efficient data interchange format"
DESCRIPTION = "MessagePack is a binary-based efficient object serialization library. It \
enables to exchange structured objects between many languages like JSON. But \
unlike JSON, it is very fast and small."
LICENSE = "Apache-2.0"

PV = "1.7.3"

RPM_NAME = "ruby4.0-rubygem-msgpack-1.7.3-1.11.aarch64.rpm"
RPM_HASH = "2b209428db55a5a6e285c90c4fc67ee926f54bd924901e24a02c6b2f06fa39b2828df5f6205fba3b95e7cbf8b5b225a1b534e609ebaf4184019820aafdfb5e85"

RPROVIDES:${PN} += "ruby4.0-rubygem-msgpack \
rubygem-msgpack \
rubygem-ruby-4.0.0-msgpack \
rubygem-ruby-4.0.0-msgpack-1 \
rubygem-ruby-4.0.0-msgpack-1.7 \
rubygem-ruby-4.0.0-msgpack-1.7.3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
