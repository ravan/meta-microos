SUMMARY = "A cool framework for doing high performance I/O in Ruby"
DESCRIPTION = "Cool.io provides a high performance event framework for Ruby which uses the \
libev C library."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "ruby4.0-rubygem-cool.io-1.9.0-1.11.aarch64.rpm"
RPM_HASH = "4110ee5220fc75c76e9cd46195ebc3f07f39c30156eb51d5919a2e73dc239606de91374e1a8fb637acc0248a7367d583c33a72113d16faac5a7ed6084637ee11"

RPROVIDES:${PN} += "ruby4.0-rubygem-cool.io \
rubygem-cool.io \
rubygem-ruby-4.0.0-cool.io \
rubygem-ruby-4.0.0-cool.io-1 \
rubygem-ruby-4.0.0-cool.io-1.9 \
rubygem-ruby-4.0.0-cool.io-1.9.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
