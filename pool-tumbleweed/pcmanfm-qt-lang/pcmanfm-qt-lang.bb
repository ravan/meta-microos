SUMMARY = "Translations for package pcmanfm-qt"
DESCRIPTION = "Provides translations for the 'pcmanfm-qt' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "pcmanfm-qt-lang-2.4.1-1.1.noarch.rpm"
RPM_HASH = "6499b7d4f8c5340f862422186c0481f569bacf2388fcf7ed741a67f007c3af67614847105b352188b92a3f30e6d77e0d4a540ddd7e663b7edd98f702291f8118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcmanfm-qt-lang \
pcmanfm-qt-lang-all"

RDEPENDS:${PN} += "pcmanfm-qt"

inherit rpm
