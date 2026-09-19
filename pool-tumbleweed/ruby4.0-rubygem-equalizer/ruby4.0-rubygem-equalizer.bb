SUMMARY = "Module to define equality, equivalence and inspection methods"
DESCRIPTION = "Module to define equality, equivalence and inspection methods."
LICENSE = "MIT"

PV = "0.0.11"

RPM_NAME = "ruby4.0-rubygem-equalizer-0.0.11-1.46.aarch64.rpm"
RPM_HASH = "8ee5f62789e0e3cf8660686ac69644a121a61ee9626cfb79d3986986ebb930003678d3e2d3b1c18a10da3392f7164dfa0188baf806b51bf2787b2c2e7bfe8748"

RPROVIDES:${PN} += "ruby4.0-rubygem-equalizer \
rubygem-equalizer \
rubygem-ruby-4.0.0-equalizer \
rubygem-ruby-4.0.0-equalizer-0 \
rubygem-ruby-4.0.0-equalizer-0.0 \
rubygem-ruby-4.0.0-equalizer-0.0.11"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
