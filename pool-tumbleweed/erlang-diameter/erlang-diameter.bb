SUMMARY = "Main API of the Diameter application"
DESCRIPTION = "This module provides the interface with which a user can implement a Diameter \
node that sends and receives messages using the Diameter protocol as defined in \
RFC 6733."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-diameter-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "0435a4b2c3d07b2a7202db9fb73bc99287633d726c97f344e11378645fc00b45939f7c5e542863a06a493cb323cec39dc143b59f87b7717fda7f48750e422f16"

RPROVIDES:${PN} += "erlang-diameter"

RDEPENDS:${PN} += "/usr/bin/env \
erlang"

inherit rpm
