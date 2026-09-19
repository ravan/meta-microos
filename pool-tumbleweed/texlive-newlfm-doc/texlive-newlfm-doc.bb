SUMMARY = "Documentation for texlive-newlfm"
DESCRIPTION = "This package includes the documentation for texlive-newlfm"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.9.4svn15878"

RPM_NAME = "texlive-newlfm-doc-2026.226.9.4svn15878-61.2.noarch.rpm"
RPM_HASH = "730bd5ccc5d95a87feb7d7c6adf3f9ea570502525fef4aae6364ca2fc5fb00548dcffbe92ad6137eb51092117e0e6d7bec90482d4364d15f9442e11dde1d55f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newlfm-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
