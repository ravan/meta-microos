SUMMARY = "A pure Ruby library for event-driven IO"
DESCRIPTION = "A pure Ruby library for event-driven IO."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ruby4.0-rubygem-backport-1.2.0-1.25.aarch64.rpm"
RPM_HASH = "9860bc86809e91942e19141528ee6d41e97ba107b10792a43785ca30f1755345946c97264ddc1081301ad531173d6b9f5046b7a465ff54cd6d6f0782ccc15a90"

RPROVIDES:${PN} += "ruby4.0-rubygem-backport \
rubygem-backport \
rubygem-ruby-4.0.0-backport \
rubygem-ruby-4.0.0-backport-1 \
rubygem-ruby-4.0.0-backport-1.2 \
rubygem-ruby-4.0.0-backport-1.2.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
