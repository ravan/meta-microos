SUMMARY = "Translations for package aqbanking"
DESCRIPTION = "Provides translations for the 'aqbanking' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "6.9.2"

RPM_NAME = "aqbanking-lang-6.9.2-1.2.noarch.rpm"
RPM_HASH = "b9eb256228f01f5497e18ee9d1013016bbb641112bc8584ce15046c2b2a20322c5e48a094057df99883721271916be977d304468ee02c5c6cee7d50b77231b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aqbanking-lang \
aqbanking-lang-all \
locale-aqbanking-de"

RDEPENDS:${PN} += "aqbanking"

inherit rpm
