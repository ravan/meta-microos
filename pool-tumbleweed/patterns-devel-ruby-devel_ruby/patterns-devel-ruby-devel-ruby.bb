SUMMARY = "Ruby Development"
DESCRIPTION = "Tools and libraries for software development using the Ruby programming language."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-ruby-devel_ruby-20170319-2.21.aarch64.rpm"
RPM_HASH = "634956e9f2468966190081681a4708e324b22bf185405e186f4868c4cf6aa20674e132d880513aa5e8aa4ecd1ebfd21af1aed1c7eb85b029d9caa1567b7e6360"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-ruby-devel-ruby"

RDEPENDS:${PN} += "ruby \
rubygems"

inherit rpm
