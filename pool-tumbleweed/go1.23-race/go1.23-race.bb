SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.23.12"

RPM_NAME = "go1.23-race-1.23.12-6.2.aarch64.rpm"
RPM_HASH = "83fc2cfd6ecc7b0d7c09c175a60a7f8d33122648d2d61ff983ce7b712e77288e907ae8fd9b7b00ddb28ce12172b5f3a12a62f4e5066733eb511277c80811781b"

RPROVIDES:${PN} += "go1.23-race"

RDEPENDS:${PN} += "go1.23"

inherit rpm
