SUMMARY = "Main API of the Diameter application"
DESCRIPTION = "This module provides the interface with which a user can implement a Diameter \
node that sends and receives messages using the Diameter protocol as defined in \
RFC 6733."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-diameter-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "1ea0f23659b6b5dd3ae0e99a5fa58fa8767895f33038de2a8d5e3b1c730d64d61ffda25a6ffbdd5b4749254993119ef8836bdfc5b6bf39213218533780ca5ef7"

RPROVIDES:${PN} += "erlang27-diameter"

RDEPENDS:${PN} += "/usr/bin/env \
erlang27"

inherit rpm
