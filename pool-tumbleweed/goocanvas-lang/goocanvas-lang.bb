SUMMARY = "Translations for package goocanvas"
DESCRIPTION = "Provides translations for the 'goocanvas' package."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "goocanvas-lang-3.0.0-5.6.noarch.rpm"
RPM_HASH = "bf225fd9e4bd5c80f4188e082972c8323610d910344b25bd7c4f7a2c60238504cca8fc4135b87ab83ff83d2da99fb71a7de8cbaef4b745496616a1ae9d0f1f4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goocanvas-lang \
goocanvas-lang-all \
locale-goocanvas-cs \
locale-goocanvas-de \
locale-goocanvas-el \
locale-goocanvas-en-GB \
locale-goocanvas-es \
locale-goocanvas-eu \
locale-goocanvas-hu \
locale-goocanvas-id \
locale-goocanvas-ja \
locale-goocanvas-pl \
locale-goocanvas-pt-BR \
locale-goocanvas-sr \
locale-goocanvas-sv"

RDEPENDS:${PN} += "goocanvas"

inherit rpm
