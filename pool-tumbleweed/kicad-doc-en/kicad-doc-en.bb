SUMMARY = "English documentation and tutorials for KiCad"
DESCRIPTION = "This package contains English documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-en-10.0.6-1.1.noarch.rpm"
RPM_HASH = "a0c2bdc03a86b03a3292afac0b84be0091249d3983a82b56ffd63e26824e9fde5d108059eee0d870fccad3fd517fd7489522bce0a78b368ee36507f088b78166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-en \
locale-kicad-doc-en"

RDEPENDS:${PN} += "kicad \
kicad-doc"

inherit rpm
