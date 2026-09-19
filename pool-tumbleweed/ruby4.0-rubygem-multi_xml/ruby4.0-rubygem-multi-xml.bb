SUMMARY = "A generic swappable back-end for XML parsing"
DESCRIPTION = "Provides swappable XML backends utilizing LibXML, Nokogiri, Ox, or REXML."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "ruby4.0-rubygem-multi_xml-0.6.0-1.34.aarch64.rpm"
RPM_HASH = "216297baf3ed42a2ce52be1fab7f4a276347757c4007e93084b18cd8d4419f2d438cb6743f0cc7022f549eeeba2ca15626cf853201ba0441f2e6c6ee4a4d9674"

RPROVIDES:${PN} += "ruby4.0-rubygem-multi-xml \
rubygem-multi-xml \
rubygem-ruby-4.0.0-multi-xml \
rubygem-ruby-4.0.0-multi-xml-0 \
rubygem-ruby-4.0.0-multi-xml-0.6 \
rubygem-ruby-4.0.0-multi-xml-0.6.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
