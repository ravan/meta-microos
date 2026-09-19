SUMMARY = "An implementation of the AsciiDoc text processor and publishing"
DESCRIPTION = "A fast, open source text processor and publishing toolchain for converting \
AsciiDoc content to HTML 5, DocBook 5, and other formats."
LICENSE = "MIT"

PV = "2.0.23"

RPM_NAME = "ruby4.0-rubygem-asciidoctor-2.0.23-2.1.aarch64.rpm"
RPM_HASH = "7f65b3799f369c0b151d43da6140f27e8bac9eb9bbda93fee74b40e6b9c941f018414148dd442293c0d130a47c681a16a80c446fff6179a8b780c700a0724262"

RPROVIDES:${PN} += "ruby4.0-rubygem-asciidoctor \
rubygem-asciidoctor \
rubygem-ruby-4.0.0-asciidoctor \
rubygem-ruby-4.0.0-asciidoctor-2 \
rubygem-ruby-4.0.0-asciidoctor-2.0 \
rubygem-ruby-4.0.0-asciidoctor-2.0.23"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
