SUMMARY = "Linux driver for the 'Distributed Replicated Block Device'"
DESCRIPTION = "DRBD is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.1.23"

RPM_NAME = "drbd-9.1.23-10.3.aarch64.rpm"
RPM_HASH = "dcbda03eca7cf8e95b1c78f8339975909e73c8396bc0fbe6237131c41955cc5e17f0009a889c799562b9ac4708436878c3c02ff130fde15a1ec91089ac6c43b5"

RPROVIDES:${PN} += "drbd"

RDEPENDS:${PN} += "drbd-utils"

inherit rpm
