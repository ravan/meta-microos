SUMMARY = "Really simple JSON and XML parsing, ripped from Merb and Rails"
DESCRIPTION = "Really simple JSON and XML parsing, ripped from Merb and Rails."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby4.0-rubygem-crack-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "48844520593424bd1d6ad9e428f645280c9744671d56b62da0f092d36762451a95c65d98ba39ab2357cd8c1804305e2c4748fd8ae8a5c36f322bb36f7f3c9f19"

RPROVIDES:${PN} += "ruby4.0-rubygem-crack \
rubygem-crack \
rubygem-ruby-4.0.0-crack \
rubygem-ruby-4.0.0-crack-1 \
rubygem-ruby-4.0.0-crack-1.0 \
rubygem-ruby-4.0.0-crack-1.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-bigdecimal \
rubygem-ruby-4.0.0-rexml"

inherit rpm
