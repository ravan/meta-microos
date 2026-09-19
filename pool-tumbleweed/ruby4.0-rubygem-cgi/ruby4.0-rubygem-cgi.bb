SUMMARY = "Support for the Common Gateway Interface protocol"
DESCRIPTION = "Support for the Common Gateway Interface protocol."
LICENSE = "Ruby & BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "ruby4.0-rubygem-cgi-0.5.0-1.6.aarch64.rpm"
RPM_HASH = "a7f7672d68fb0cd3c8ff10a5e6ea2a7747b9f7266347fe8bddb186689c39f5fca909d85f6bf973743884a4c233dbb6e16ea5df78b94adda9981e6692efefd6d4"

RPROVIDES:${PN} += "ruby4.0-rubygem-cgi \
rubygem-cgi \
rubygem-ruby-4.0.0-cgi \
rubygem-ruby-4.0.0-cgi-0 \
rubygem-ruby-4.0.0-cgi-0.5 \
rubygem-ruby-4.0.0-cgi-0.5.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
