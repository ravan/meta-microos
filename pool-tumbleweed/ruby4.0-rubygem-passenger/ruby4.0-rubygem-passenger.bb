SUMMARY = "A fast and robust web server and application server for Ruby, Python"
DESCRIPTION = "A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use."
LICENSE = "GPL-2.0-only & MIT"

PV = "6.2.0"

RPM_NAME = "ruby4.0-rubygem-passenger-6.2.0-1.1.aarch64.rpm"
RPM_HASH = "e4f7502d256b3d9fe0a8bd3ac5c58cab22948da063b03054e4fb12989073fbba9002b6927a51207ca71a201e429149426ca9213bd2de4ead69266c93c3552f02"

RPROVIDES:${PN} += "ruby4.0-rubygem-passenger \
rubygem-passenger \
rubygem-ruby-4.0.0-passenger \
rubygem-ruby-4.0.0-passenger-6 \
rubygem-ruby-4.0.0-passenger-6.2 \
rubygem-ruby-4.0.0-passenger-6.2.0"

RDEPENDS:${PN} += "/usr/bin/node \
/usr/bin/ruby.ruby4.0 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-passenger \
rubygem-ruby-4.0.0-logger \
rubygem-ruby-4.0.0-rack \
rubygem-ruby-4.0.0-rackup \
rubygem-ruby-4.0.0-rake"

inherit rpm
