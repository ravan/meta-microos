SUMMARY = "Trusted collections handling: server and signer"
DESCRIPTION = "The Notary project comprises a server and a client for running and \
interacting with trusted collections."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "notary-0.7.0-2.17.aarch64.rpm"
RPM_HASH = "cf816cc6411282e56853ac4e1a34884bcffe1511f5623a3971f3dc09c35dd9e89083ce7a8ba3d6fbac06c4ce34c2ced84f94b2f384b8be98019f2dbf0d2b73bb"

RPROVIDES:${PN} += "config-notary \
notary"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
