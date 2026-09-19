SUMMARY = "Translations for package goocanvas2"
DESCRIPTION = "Provides translations for the 'goocanvas2' package."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "goocanvas2-lang-2.0.4-5.6.noarch.rpm"
RPM_HASH = "ff210de9e03dbc36c7f0c03fd8aac476b4beb026d8909d36f0a82d8205e0f30d9a3a6aae3762bce8527be98a41b0b29bf47f2411fafb5a67c1e4510168013f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goocanvas2-lang \
goocanvas2-lang-all \
locale-goocanvas2-cs \
locale-goocanvas2-de \
locale-goocanvas2-en-GB \
locale-goocanvas2-es \
locale-goocanvas2-id \
locale-goocanvas2-ja \
locale-goocanvas2-pl \
locale-goocanvas2-pt-BR \
locale-goocanvas2-sr \
locale-goocanvas2-sv"

RDEPENDS:${PN} += "goocanvas2"

inherit rpm
