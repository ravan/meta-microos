SUMMARY = "kramdown-parser-gfm provides a kramdown parser for the GFM dialect"
DESCRIPTION = "kramdown-parser-gfm provides a kramdown parser for the GFM dialect of \
Markdown."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby4.0-rubygem-kramdown-parser-gfm-1.1.0-1.27.aarch64.rpm"
RPM_HASH = "6f15232525f57bbf42302d6aa8e4224ee26fe86aa34c5b6fa72a71489719dcc3045a5225f937336e1e842c97de1bb14ab4cf89d127fe00f315a63ac72ebc6086"

RPROVIDES:${PN} += "ruby4.0-rubygem-kramdown-parser-gfm \
rubygem-kramdown-parser-gfm \
rubygem-ruby-4.0.0-kramdown-parser-gfm \
rubygem-ruby-4.0.0-kramdown-parser-gfm-1 \
rubygem-ruby-4.0.0-kramdown-parser-gfm-1.1 \
rubygem-ruby-4.0.0-kramdown-parser-gfm-1.1.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-kramdown-2"

inherit rpm
