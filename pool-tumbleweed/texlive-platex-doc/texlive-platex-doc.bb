SUMMARY = "Documentation for texlive-platex"
DESCRIPTION = "This package includes the documentation for texlive-platex"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-platex-doc-2026.226.svn77830-59.2.noarch.rpm"
RPM_HASH = "1b68160940413fcc1662a22871e9bad30752c84621562c5cb2ac23ad8cb1119d7f997927e3fea9167e0811614718d76ce32947cf9e58db610996ddef6b6efcf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-platex-doc-ja \
man-platex.1 \
texlive-platex-doc"

RDEPENDS:${PN} += ""

inherit rpm
