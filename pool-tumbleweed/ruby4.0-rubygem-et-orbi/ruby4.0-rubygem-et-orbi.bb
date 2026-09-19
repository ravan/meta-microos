SUMMARY = "time with zones"
DESCRIPTION = "Time zones for fugit and rufus-scheduler. Urbi et Orbi."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "ruby4.0-rubygem-et-orbi-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "68540dbd4eb9a35989cde86ba764b247f80a6204875edb5cf0c95a14c41d7705ac1737c7b76ad8f1298d95d13f3f1f083b1f6bb9dca1781cabd8a0cf02924dcc"

RPROVIDES:${PN} += "ruby4.0-rubygem-et-orbi \
rubygem-et-orbi \
rubygem-ruby-4.0.0-et-orbi \
rubygem-ruby-4.0.0-et-orbi-1 \
rubygem-ruby-4.0.0-et-orbi-1.4 \
rubygem-ruby-4.0.0-et-orbi-1.4.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-tzinfo"

inherit rpm
