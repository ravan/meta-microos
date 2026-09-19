SUMMARY = "Translations for package gtklock"
DESCRIPTION = "Provides translations for the 'gtklock' package."
LICENSE = "GPL-3.0-only"

PV = "4.0.0"

RPM_NAME = "gtklock-lang-4.0.0-1.9.noarch.rpm"
RPM_HASH = "e61e7075f41a3aca6c20903e6bc839df914a6e158ca538b9f37b76b2017754f1ea0b8cd6a32ebc9b31203b767e5b9dced9852a7c3ffb15261a49ab45885d5457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtklock-lang \
gtklock-lang-all \
locale-gtklock-cs \
locale-gtklock-de \
locale-gtklock-sr \
locale-gtklock-sr@latin"

RDEPENDS:${PN} += "gtklock"

inherit rpm
