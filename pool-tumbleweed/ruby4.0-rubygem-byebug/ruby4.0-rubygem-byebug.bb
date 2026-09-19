SUMMARY = "Ruby fast debugger - base + CLI"
DESCRIPTION = "Byebug is a Ruby debugger. It's implemented using the \
TracePoint C API for execution control and the Debug Inspector C API for \
call stack navigation.  The core component provides support that front-ends \
can build on. It provides breakpoint handling and bindings for stack frames \
among other things and it comes with an easy to use command line interface."
LICENSE = "BSD-2-Clause"

PV = "11.1.3"

RPM_NAME = "ruby4.0-rubygem-byebug-11.1.3-2.1.aarch64.rpm"
RPM_HASH = "ec6f43905d44f05fb80a1208b7896bff37f58a8eb7d7ea2b4ccde8d3fa5c8d5c5520bb82747875e49284c68acb3a3d356628aa3f42b4f7ecd24d59f00e9e7d1e"

RPROVIDES:${PN} += "ruby4.0-rubygem-byebug \
rubygem-byebug \
rubygem-ruby-4.0.0-byebug \
rubygem-ruby-4.0.0-byebug-11 \
rubygem-ruby-4.0.0-byebug-11.1 \
rubygem-ruby-4.0.0-byebug-11.1.3"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
