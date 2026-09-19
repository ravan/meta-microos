SUMMARY = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby. \
It provides a \
sensible, easy-to-understand API for reading, writing, modifying, and querying \
documents. It is \
fast and standards-compliant by relying on native parsers like libxml2, \
libgumbo, or xerces."
LICENSE = "MIT"

PV = "1.19.4"

RPM_NAME = "ruby4.0-rubygem-nokogiri-1.19.4-1.3.aarch64.rpm"
RPM_HASH = "f42d3ef2d23a7cf1b18d0306ab4ba2820111088854e2a2ca357796f11e11137267d0e50143dff8646a57610cdddeb4558a13662bb427a3e6257808bce2a53c44"

RPROVIDES:${PN} += "ruby4.0-rubygem-nokogiri \
rubygem-nokogiri \
rubygem-ruby-4.0.0-nokogiri \
rubygem-ruby-4.0.0-nokogiri-1 \
rubygem-ruby-4.0.0-nokogiri-1.19 \
rubygem-ruby-4.0.0-nokogiri-1.19.4"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libm.so.6 \
libruby4.0.so.4.0 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-ruby-4.0.0-racc-1"

inherit rpm
