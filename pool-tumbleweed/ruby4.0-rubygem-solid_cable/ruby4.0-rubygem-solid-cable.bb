SUMMARY = "Database-backed Action Cable backend"
DESCRIPTION = "Database-backed Action Cable backend."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby4.0-rubygem-solid_cable-4.0.0-1.2.aarch64.rpm"
RPM_HASH = "d778133c58590113b717d340312b84eaa23ff7200bc9fd0940201705f36013ce5ad1de02bdba4949ed04fdd78501836e63ca94e5baa9cbc973c688b7ffc73161"

RPROVIDES:${PN} += "ruby4.0-rubygem-solid-cable \
rubygem-ruby-4.0.0-solid-cable \
rubygem-ruby-4.0.0-solid-cable-4 \
rubygem-ruby-4.0.0-solid-cable-4.0 \
rubygem-ruby-4.0.0-solid-cable-4.0.0 \
rubygem-solid-cable"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actioncable \
rubygem-ruby-4.0.0-activejob \
rubygem-ruby-4.0.0-activerecord \
rubygem-ruby-4.0.0-railties"

inherit rpm
