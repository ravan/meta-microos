SUMMARY = "Launchy is helper class for launching cross-platform applications in"
DESCRIPTION = "Launchy is helper class for launching cross-platform applications in a fire \
and forget manner. There are application concepts (browser, email client, etc) \
that are common across all platforms, and they may be launched differently on \
each platform. Launchy is here to make a common approach to launching external \
applications from within ruby programs."
LICENSE = "ISC"

PV = "3.0.1"

RPM_NAME = "ruby4.0-rubygem-launchy-3.0.1-1.12.aarch64.rpm"
RPM_HASH = "3b22d191d45220d7ad69b77cdc664b0a31f70232b62e8a522144e71cf17a9b709a45b8d03f6623dc367ba52b810426016f459bd1f52f9e30353f984c8dca734e"

RPROVIDES:${PN} += "ruby4.0-rubygem-launchy \
rubygem-launchy \
rubygem-ruby-4.0.0-launchy \
rubygem-ruby-4.0.0-launchy-3 \
rubygem-ruby-4.0.0-launchy-3.0 \
rubygem-ruby-4.0.0-launchy-3.0.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-addressable-2 \
rubygem-ruby-4.0.0-childprocess-5"

inherit rpm
