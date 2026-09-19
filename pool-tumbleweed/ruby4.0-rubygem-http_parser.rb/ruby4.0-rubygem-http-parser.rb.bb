SUMMARY = "Simple callback-based HTTP request/response parser"
DESCRIPTION = "Ruby bindings to https://github.com/joyent/http-parser and \
https://github.com/http-parser/http-parser.java."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "ruby4.0-rubygem-http_parser.rb-0.8.0-1.28.aarch64.rpm"
RPM_HASH = "44c1202d99e3ebbe5605b4a02792f1f0c2a26a5144cfbca953aa97898bafe96588c3b2af30f632637a2b8873dcee757e45d718f14a75a5fd8a5fe6b631131980"

RPROVIDES:${PN} += "ruby4.0-rubygem-http-parser.rb \
rubygem-http-parser.rb \
rubygem-ruby-4.0.0-http-parser.rb \
rubygem-ruby-4.0.0-http-parser.rb-0 \
rubygem-ruby-4.0.0-http-parser.rb-0.8 \
rubygem-ruby-4.0.0-http-parser.rb-0.8.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
