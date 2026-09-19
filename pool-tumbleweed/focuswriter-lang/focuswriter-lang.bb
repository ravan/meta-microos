SUMMARY = "Translations for package focuswriter"
DESCRIPTION = "Provides translations for the 'focuswriter' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.1"

RPM_NAME = "focuswriter-lang-1.9.1-1.1.noarch.rpm"
RPM_HASH = "a8e1141e3f44f0844ad97bc6ad784b025d9f867b730cfa7efab6a26e8053470e3c3b6cc35d6603714d743e8cd1b7fed54cadaa9bea4ee7adce8714a03900dc81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "focuswriter-lang \
focuswriter-lang-all"

RDEPENDS:${PN} += "focuswriter"

inherit rpm
