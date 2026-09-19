SUMMARY = "IBM Sametime Community Client library"
DESCRIPTION = "A library to establish instant messaging connections to the IBM \
Sametime IM server."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "meanwhile-doc-1.1.1-2.10.aarch64.rpm"
RPM_HASH = "6f84a5a7690e188b8e5b82e000db469ef2e3530f7e69cbf76676201b5ced8e2c07acdcb0eebe1c6af070b153362c4279373628b2804023fe4dfb0d086ddeb9cd"

RPROVIDES:${PN} += "meanwhile-doc"

RDEPENDS:${PN} += ""

inherit rpm
