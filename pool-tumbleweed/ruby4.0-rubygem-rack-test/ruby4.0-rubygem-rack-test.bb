SUMMARY = "Simple testing API built on Rack"
DESCRIPTION = "Rack::Test is a small, simple testing API for Rack apps. It can be used on its \
own or as a reusable starting point for Web frameworks and testing libraries \
to build on."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "ruby4.0-rubygem-rack-test-2.1.0-1.11.aarch64.rpm"
RPM_HASH = "b79fb2c0273ac20fed511555e74ab6050484b7d2e68607ad2ca3319f2bc238967abf87611c66ab93e45505e29d4423539994c34ed9fb14c37fcc65baa4b21014"

RPROVIDES:${PN} += "ruby4.0-rubygem-rack-test \
rubygem-rack-test \
rubygem-ruby-4.0.0-rack-test \
rubygem-ruby-4.0.0-rack-test-2 \
rubygem-ruby-4.0.0-rack-test-2.1 \
rubygem-ruby-4.0.0-rack-test-2.1.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-rack"

inherit rpm
