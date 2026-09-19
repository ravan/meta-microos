SUMMARY = "time tools for flor"
DESCRIPTION = "Time tools for flor and the floraison project. Cron parsing and occurrence \
computing. Timestamps and more."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "ruby4.0-rubygem-fugit-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "fa019fe274109ce0a72da4c9e6bd0b7789bfd0ee3fd79d4be3c3b5c4b1acfaaa2001ea47188e4055393c7bbada5cbf70d1cca18d6603b1b19137dc7d20a23b09"

RPROVIDES:${PN} += "ruby4.0-rubygem-fugit \
rubygem-fugit \
rubygem-ruby-4.0.0-fugit \
rubygem-ruby-4.0.0-fugit-1 \
rubygem-ruby-4.0.0-fugit-1.13 \
rubygem-ruby-4.0.0-fugit-1.13.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-et-orbi-1 \
rubygem-ruby-4.0.0-raabro-1"

inherit rpm
