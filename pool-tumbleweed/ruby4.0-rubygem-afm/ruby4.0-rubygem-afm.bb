SUMMARY = "reading Adobe Font Metrics (afm) files"
DESCRIPTION = "a simple library to read afm files and use the data conveniently."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ruby4.0-rubygem-afm-0.2.2-1.28.aarch64.rpm"
RPM_HASH = "a8103af33ab01fbbfea29a89444b670967d52cf56e258be9236766e887937505839a384b4b6f48a079b479684d1886e309140c4215dea8d2e383624f72e881da"

RPROVIDES:${PN} += "ruby4.0-rubygem-afm \
rubygem-afm \
rubygem-ruby-4.0.0-afm \
rubygem-ruby-4.0.0-afm-0 \
rubygem-ruby-4.0.0-afm-0.2 \
rubygem-ruby-4.0.0-afm-0.2.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
