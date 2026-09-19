SUMMARY = "Ruby CSS parser"
DESCRIPTION = "A set of classes for parsing CSS in Ruby."
LICENSE = "MIT"

PV = "1.19.1"

RPM_NAME = "ruby4.0-rubygem-css_parser-1.19.1-1.11.aarch64.rpm"
RPM_HASH = "70babbfb1a78d616570e7cf6bb55fe2637263bebdef2a7cdcc93f6d98900b65df74049afc82cd5c338ddde5e99e8332f0310e3b18e11c9a96e3ef474e5f66c86"

RPROVIDES:${PN} += "ruby4.0-rubygem-css-parser \
rubygem-css-parser \
rubygem-ruby-4.0.0-css-parser \
rubygem-ruby-4.0.0-css-parser-1 \
rubygem-ruby-4.0.0-css-parser-1.19 \
rubygem-ruby-4.0.0-css-parser-1.19.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-addressable"

inherit rpm
