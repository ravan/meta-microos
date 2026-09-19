SUMMARY = "Bopomofo input schema for rime"
DESCRIPTION = "bopomofo input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-bopomofo-20250315-1.4.noarch.rpm"
RPM_HASH = "ee4561d963db2388e57a03980da6f82d174a506da7824aa9de5c11c5edcedf4f062514558cc6f66f83c97379c1aac245c0adc61d576e3f0ab1508f2aa4b64514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-bopomofo"

RDEPENDS:${PN} += ""

inherit rpm
