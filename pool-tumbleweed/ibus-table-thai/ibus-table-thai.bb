SUMMARY = "The Thai table for ibus-table"
DESCRIPTION = "ibus-table-thai provides the Thai table for ibus-table. \
ภาษาไทย / Thai"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-thai-1.3.21-1.5.noarch.rpm"
RPM_HASH = "e960ce0ce4d165c37a4e00d7b4c09e6ab56472d432d11ac664f150dbf3bc94570a1edb566a372a2b624fb8f068d7a57a48f40b54711f433a235961ba63372aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-thai"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
