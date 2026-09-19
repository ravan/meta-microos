SUMMARY = "Robust streaming downloads using Net::HTTP, HTTP.rb or wget"
DESCRIPTION = "Robust streaming downloads using Net::HTTP, HTTP.rb or wget."
LICENSE = "MIT"

PV = "5.4.2"

RPM_NAME = "ruby4.0-rubygem-down-5.4.2-1.11.aarch64.rpm"
RPM_HASH = "ff9b0a6ce2c8861dee899938b47b3b25595921e01d8c4364b08c2e974518f15ade11894cecf0a029c2108c0a908b7fd0fb80cfd7c27f941d5787d936ade615d3"

RPROVIDES:${PN} += "ruby4.0-rubygem-down \
rubygem-down \
rubygem-ruby-4.0.0-down \
rubygem-ruby-4.0.0-down-5 \
rubygem-ruby-4.0.0-down-5.4 \
rubygem-ruby-4.0.0-down-5.4.2"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-addressable-2"

inherit rpm
