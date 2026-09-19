SUMMARY = "Documentation for libmnl, a Netlink communications library"
DESCRIPTION = "libmnl is a user-space library for parsing, validation, constructing \
Netlink headers and TLVs. This subpackage has the documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libmnl-doc-1.0.5-2.8.noarch.rpm"
RPM_HASH = "a96cf0b64b6b66709189da83e053e1b33ec26793ae67a4153aeb8d99f697edbe07f618b946da9c256dfd27c66753aa1c8951d448409d5d003bc68670398f8584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmnl-doc"

RDEPENDS:${PN} += ""

inherit rpm
