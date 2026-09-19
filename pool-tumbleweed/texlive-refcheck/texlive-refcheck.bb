SUMMARY = "Check references (in figures, table, equations, etc)"
DESCRIPTION = "The package checks references in a document, looking for \
numbered but unlabelled equations, for labels which are not \
used in the text, for unused bibliography references. It can \
also display label names in text near corresponding numbers of \
equations and/or bibliography references."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.9.2svn77682"

RPM_NAME = "texlive-refcheck-2026.226.1.9.2svn77682-60.4.noarch.rpm"
RPM_HASH = "39bbf58b44d47d60e5f7deb600990395129d52f0ea47a3d1082c304d8ab8692e95e7f797666f882eceab2434e35a2eccffd9b5f0eebb11995a3e6161a8825394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-refcheck.sty \
texlive-refcheck"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
