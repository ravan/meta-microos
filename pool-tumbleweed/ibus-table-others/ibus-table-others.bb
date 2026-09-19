SUMMARY = "Other non-Chinese tables for ibus"
DESCRIPTION = "This package contains all other non-Chinese tables for ibus e.g. CNS11643, \
Compose, Emoji, Ipx-x-sampa, Latex, Rustrad, Thai, Translit-ua, Translit, Viqr, \
Yawerty. This package contains only COPYING and Documents, Please select the \
table you want to use."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-others-1.3.21-1.5.noarch.rpm"
RPM_HASH = "70ebb8989ad6cd7fc1c2b03d4065201babd440571fbd0c6d6b7d5868c6b8cd70e014e1e2ebb86bb30258335fc052783ccee8b6545086e89b67d759bafd4f219b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-others"

RDEPENDS:${PN} += ""

inherit rpm
