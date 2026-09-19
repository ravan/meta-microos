SUMMARY = "Documentation for texlive-fragmaster"
DESCRIPTION = "This package includes the documentation for texlive-fragmaster"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn26313"

RPM_NAME = "texlive-fragmaster-doc-2026.226.1.6svn26313-60.2.noarch.rpm"
RPM_HASH = "d739f87fba704798d7b71404ac43403dd527c133dc09eff2c0a2d601a7a4952f838dcecfe0ed0cf1aa3bb77312574734d6c48fc8db22a10ac2dc4f676f38db74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fragmaster-doc-en;de \
texlive-fragmaster-doc"

RDEPENDS:${PN} += ""

inherit rpm
