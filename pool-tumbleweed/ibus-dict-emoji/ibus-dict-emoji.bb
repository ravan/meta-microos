SUMMARY = "Emoji dictionary for IBus"
DESCRIPTION = "This package contains data of emoji dictionary for IBus and other applications"
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.34"

RPM_NAME = "ibus-dict-emoji-1.5.34-2.1.noarch.rpm"
RPM_HASH = "b12b533f56576d0c1b350af500396df517cb4d8bbc3ffb93442764856e951a67d9a1e1acce5dcde0a4c062c299431aaf5f87d19060660f14269704039834ec23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-dict-emoji"

RDEPENDS:${PN} += ""

inherit rpm
