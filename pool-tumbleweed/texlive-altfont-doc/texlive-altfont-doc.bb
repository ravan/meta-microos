SUMMARY = "Documentation for texlive-altfont"
DESCRIPTION = "This package includes the documentation for texlive-altfont"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-altfont-doc-2026.226.1.1svn15878-61.2.noarch.rpm"
RPM_HASH = "d1b77e08d4b18edbd42c1f684131cbe14666204f2dec95c66ef4eabaa58a5a71e70442852f6d186bf696516ec85963179f42a259a941f04040f1d9addb2884eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-altfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
