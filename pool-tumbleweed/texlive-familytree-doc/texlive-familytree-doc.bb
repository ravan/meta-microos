SUMMARY = "Documentation for texlive-familytree"
DESCRIPTION = "This package includes the documentation for texlive-familytree"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.1svn63739"

RPM_NAME = "texlive-familytree-doc-2026.226.3.1svn63739-59.2.noarch.rpm"
RPM_HASH = "26851f7b51e0c8d34fbaffaecea62917483c259217a1d38e532dae2c6a75c9512caa7f102ee6a3946efca4200aff583582b3a109c0288209a03da4ad31a90f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-familytree-doc-ja \
texlive-familytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
