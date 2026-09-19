SUMMARY = "Puma is a simple, fast, threaded, and highly parallel HTTP 1.1"
DESCRIPTION = "Puma is a simple, fast, threaded, and highly parallel HTTP 1.1 server for \
Ruby/Rack applications. Puma is intended for use in both development and \
production environments. It's great for highly parallel Ruby implementations \
such as Rubinius and JRuby as well as as providing process worker support to \
support CRuby well."
LICENSE = "BSD-3-Clause"

PV = "6.4.3"

RPM_NAME = "ruby4.0-rubygem-puma-6.4.3-1.12.aarch64.rpm"
RPM_HASH = "51f485da4c16f7f111e9c6c400fd03923006c28f9eb38447972061227c4efed7b921aa6a7c72c7dfd740fbeffa733aca81312a9de2c47e68636c235219df4226"

RPROVIDES:${PN} += "ruby4.0-rubygem-puma \
rubygem-puma \
rubygem-ruby-4.0.0-puma \
rubygem-ruby-4.0.0-puma-6 \
rubygem-ruby-4.0.0-puma-6.4 \
rubygem-ruby-4.0.0-puma-6.4.3"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby4.0 \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libruby4.0.so.4.0 \
libssl.so.3 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-ruby-4.0.0-nio4r-2"

inherit rpm
