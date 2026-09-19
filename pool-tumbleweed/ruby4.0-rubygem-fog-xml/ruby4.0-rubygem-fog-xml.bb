SUMMARY = "XML parsing for fog providers"
DESCRIPTION = "Extraction of the XML parsing tools shared between a \
number of providers in the 'fog' gem."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "ruby4.0-rubygem-fog-xml-0.1.5-1.8.aarch64.rpm"
RPM_HASH = "646d5383acd8569a8f56e46f3f6389eb30f04a36ce7fdf59adab833706ee88a6bbdba4671c6ef1e81f97774aaebd2ef500b13b698692379383a45caf8a982e9f"

RPROVIDES:${PN} += "ruby4.0-rubygem-fog-xml \
rubygem-fog-xml \
rubygem-ruby-4.0.0-fog-xml \
rubygem-ruby-4.0.0-fog-xml-0 \
rubygem-ruby-4.0.0-fog-xml-0.1 \
rubygem-ruby-4.0.0-fog-xml-0.1.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-fog-core \
rubygem-ruby-4.0.0-nokogiri"

inherit rpm
