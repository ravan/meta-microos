SUMMARY = "kramdown is a fast, pure-Ruby Markdown-superset converter"
DESCRIPTION = "kramdown is yet-another-markdown-parser but fast, pure Ruby, \
using a strict syntax definition and supporting several common extensions."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby4.0-rubygem-kramdown-2.4.0-2.1.aarch64.rpm"
RPM_HASH = "9973dd5d0dfb8a1568149a6c51423398649e238c07c73975c3834ca35ba8120e17179deb62a71b6168d8b8bac5fecdac70d29c4ada6adf1be3b4bb38d27e1418"

RPROVIDES:${PN} += "ruby4.0-rubygem-kramdown \
rubygem-kramdown \
rubygem-ruby-4.0.0-kramdown \
rubygem-ruby-4.0.0-kramdown-2 \
rubygem-ruby-4.0.0-kramdown-2.4 \
rubygem-ruby-4.0.0-kramdown-2.4.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-rexml"

inherit rpm
