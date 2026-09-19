SUMMARY = "HTML/XML manipulation and sanitization based on Nokogiri"
DESCRIPTION = "Loofah is a general library for manipulating and transforming HTML/XML documents and fragments. \
It's built on top of Nokogiri and libxml2, so it's fast and has a nice API. \
 \
Loofah excels at HTML sanitization (XSS prevention). It includes some nice HTML sanitizers, \
which are based on HTML5lib's whitelist, so it most likely won't make your codes less secure."
LICENSE = "MIT"

PV = "2.25.2"

RPM_NAME = "ruby4.0-rubygem-loofah-2.25.2-1.1.aarch64.rpm"
RPM_HASH = "140cec73d4a18e2df1722a202d5bcbd567ed1d2e7b1e3d61146da46ce76a6e09b08e9160322774eb15251fc4571c2f40e43e8ed2b38fe80dd4a4bef2b3749424"

RPROVIDES:${PN} += "ruby4.0-rubygem-loofah \
rubygem-loofah \
rubygem-ruby-4.0.0-loofah \
rubygem-ruby-4.0.0-loofah-2 \
rubygem-ruby-4.0.0-loofah-2.25 \
rubygem-ruby-4.0.0-loofah-2.25.2"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-crass-1.0 \
rubygem-ruby-4.0.0-nokogiri"

inherit rpm
