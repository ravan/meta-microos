SUMMARY = "A policy management tool for interacting with Gatekeeper"
DESCRIPTION = "Konstraint is a CLI tool to assist with the creation and management of \
templates and constraints when using Gatekeeper."
LICENSE = "Apache-2.0"

PV = "0.43.0"

RPM_NAME = "konstraint-0.43.0-1.8.aarch64.rpm"
RPM_HASH = "6f7b97ab4bf382db8cdb90b657a3ad67ed0f57a03b3b1c6892783204fc8955da6de5f07fa74f1227f8f6c91e936954d5d732ede0fb189918af93a7f3718556e0"

RPROVIDES:${PN} += "konstraint"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
