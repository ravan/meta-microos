SUMMARY = "Estonian language module for glossaries package"
DESCRIPTION = "This package provides the Estonian language module for the \
glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn49928"

RPM_NAME = "texlive-glossaries-estonian-2026.226.1.0svn49928-60.4.noarch.rpm"
RPM_HASH = "df82c4c52d07467e31cdd53637b15f58857450db352dc77966d51c12d1e643bcd945b9026ade0ebc9368e330b22117b6348185ea090e4db969c6601562a83b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-estonian-ascii.ldf \
tex-glossaries-estonian-utf8.ldf \
tex-glossaries-estonian.ldf \
texlive-glossaries-estonian"

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
