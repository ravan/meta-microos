SUMMARY = "HTTP User Agent parser"
DESCRIPTION = "HTTP User Agent parser."
LICENSE = "MIT"

PV = "0.16.11"

RPM_NAME = "ruby4.0-rubygem-useragent-0.16.11-1.10.aarch64.rpm"
RPM_HASH = "2db46943f45fb612015ee223a4bc22b8653570792050f4e93da9fba815e871ada448ec0645235a3e52afe1b53b2b681d8a9e4b1b1ffbea921117375dc3241b63"

RPROVIDES:${PN} += "ruby4.0-rubygem-useragent \
rubygem-ruby-4.0.0-useragent \
rubygem-ruby-4.0.0-useragent-0 \
rubygem-ruby-4.0.0-useragent-0.16 \
rubygem-ruby-4.0.0-useragent-0.16.11 \
rubygem-useragent"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
