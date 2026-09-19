SUMMARY = "OO authorization for Rails"
DESCRIPTION = "Object oriented authorization for Rails applications."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby4.0-rubygem-pundit-2.4.0-1.10.aarch64.rpm"
RPM_HASH = "6df094569aede947c20e11adcab9632b12ed48c99b74214f7664031b719e2a120531b8fe88ff8290ecfc42de0c533ad0dcbb1f546c23b2f7765e7a57c41aa4c8"

RPROVIDES:${PN} += "ruby4.0-rubygem-pundit \
rubygem-pundit \
rubygem-ruby-4.0.0-pundit \
rubygem-ruby-4.0.0-pundit-2 \
rubygem-ruby-4.0.0-pundit-2.4 \
rubygem-ruby-4.0.0-pundit-2.4.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activesupport"

inherit rpm
