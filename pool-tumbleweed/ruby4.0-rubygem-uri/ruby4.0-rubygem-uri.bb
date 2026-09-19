SUMMARY = "URI is a module providing classes to handle Uniform Resource"
DESCRIPTION = "URI is a module providing classes to handle Uniform Resource Identifiers."
LICENSE = "BSD-2-Clause & Ruby"

PV = "1.1.1"

RPM_NAME = "ruby4.0-rubygem-uri-1.1.1-1.2.aarch64.rpm"
RPM_HASH = "7016031c0f92e6c8d33e609d023c0570f9df18fba5991a8698a6c79c892374f83bb24ec973c114f8a4be982954d5b3c51ccb25cb9c6929bbe4e8858cddedef17"

RPROVIDES:${PN} += "ruby4.0-rubygem-uri \
rubygem-ruby-4.0.0-uri \
rubygem-ruby-4.0.0-uri-1 \
rubygem-ruby-4.0.0-uri-1.1 \
rubygem-ruby-4.0.0-uri-1.1.1 \
rubygem-uri"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
