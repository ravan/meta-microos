SUMMARY = "Translations for package spectacle-doc"
DESCRIPTION = "Provides translations for the 'spectacle-doc' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "spectacle-doc-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "02e137f2aa811184bfe2e1f646406ebe6db64a2c241705cc50eee1eccb74c34fc46b5154f95fa5aedc9d00dfef673c89a145fe49249432bbc43fe48987f9b16c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spectacle-doc-lang \
spectacle-doc-lang-all"

RDEPENDS:${PN} += "spectacle-doc"

inherit rpm
