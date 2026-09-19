SUMMARY = "a very dumb PEG parser library"
DESCRIPTION = "A very dumb PEG parser library, with a horrible interface."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "ruby4.0-rubygem-raabro-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "a00f85e36f9a201a9a4b116bbf740a0f5e41491d31453b05dd6500cb691bd281b1928d1337562b9576498879a4a5d069077a3cd92e8af32cfc1edd05e6ece94f"

RPROVIDES:${PN} += "ruby4.0-rubygem-raabro \
rubygem-raabro \
rubygem-ruby-4.0.0-raabro \
rubygem-ruby-4.0.0-raabro-1 \
rubygem-ruby-4.0.0-raabro-1.4 \
rubygem-ruby-4.0.0-raabro-1.4.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
