SUMMARY = "Small ERB Implementation"
DESCRIPTION = "Erubi is a ERB template engine for ruby. It is a simplified fork of Erubis."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "ruby4.0-rubygem-erubi-1.13.1-1.8.aarch64.rpm"
RPM_HASH = "e5172f8c531e8a1c819cf9beca1da7187c0bb820a2accea712ed8190819ab371854357128ef6eea4a5ed0c9a083b6a9243a3b094c89b7e4a5b4ee0ef74aeea45"

RPROVIDES:${PN} += "ruby4.0-rubygem-erubi \
rubygem-erubi \
rubygem-ruby-4.0.0-erubi \
rubygem-ruby-4.0.0-erubi-1 \
rubygem-ruby-4.0.0-erubi-1.13 \
rubygem-ruby-4.0.0-erubi-1.13.1"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
