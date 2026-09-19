SUMMARY = "Documentation for texlive-begriff"
DESCRIPTION = "This package includes the documentation for texlive-begriff"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn15878"

RPM_NAME = "texlive-begriff-doc-2026.226.1.6svn15878-61.2.noarch.rpm"
RPM_HASH = "b5575f8106c6f015e2416f17d843e25ea1148faad84f6b6d01bf77c6258f0c93c93a80c55d031b2f0e54b47790fc739f061028c0abfcd2eb7a3b4265bcbbab47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-begriff-doc"

RDEPENDS:${PN} += ""

inherit rpm
