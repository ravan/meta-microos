SUMMARY = "A Ruby library to handle HTTP Cookies based on RFC 6265"
DESCRIPTION = "HTTP::Cookie is a Ruby library to handle HTTP Cookies based on RFC 6265.  It \
has with security, standards compliance and compatibility in mind, to behave \
just the same as today's major web browsers.  It has builtin support for the \
legacy cookies.txt and the latest cookies.sqlite formats of Mozilla Firefox, \
and its modular API makes it easy to add support for a new backend store."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "ruby4.0-rubygem-http-cookie-1.0.8-1.8.aarch64.rpm"
RPM_HASH = "d0b19d2038a2592e916518cb6d4218e87d6752221fce47aadfa19f1e36152d1b34c0515000f86e5117ffba7532b40ef4a5a557c3e1a8947e4f5635c22c1446ec"

RPROVIDES:${PN} += "ruby4.0-rubygem-http-cookie \
rubygem-http-cookie \
rubygem-ruby-4.0.0-http-cookie \
rubygem-ruby-4.0.0-http-cookie-1 \
rubygem-ruby-4.0.0-http-cookie-1.0 \
rubygem-ruby-4.0.0-http-cookie-1.0.8"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-domain-name-0"

inherit rpm
