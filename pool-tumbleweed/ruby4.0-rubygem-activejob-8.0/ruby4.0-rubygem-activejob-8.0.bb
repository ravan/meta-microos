SUMMARY = "Job framework with pluggable queues"
DESCRIPTION = "Declare job classes that can be run by a variety of queuing backends."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-activejob-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "ed16f7e0dd32296e08704f0ec318ec1804322fcce297b2cc58d87249684fe05ce7c58502e1be16f8070c2ff2ca4b4ea94a505f693bd270b3b5f81dbc06fc2ea7"

RPROVIDES:${PN} += "ruby4.0-rubygem-activejob-8.0 \
rubygem-activejob \
rubygem-ruby-4.0.0-activejob \
rubygem-ruby-4.0.0-activejob-8 \
rubygem-ruby-4.0.0-activejob-8.0 \
rubygem-ruby-4.0.0-activejob-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-globalid"

inherit rpm
