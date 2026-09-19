SUMMARY = "Annotation symbols enclosed in square brackets and marked with an asterisk"
DESCRIPTION = "This LaTeX package can output annotation symbols enclosed in \
square brackets and marked with an asterisk."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn63838"

RPM_NAME = "texlive-asternote-2026.226.1.1svn63838-60.2.noarch.rpm"
RPM_HASH = "318d54f8b9957a3f83763c529b02c02426117ff884eb926fc1b5a10f58b69fd39b195835dab01cc7154205f8c1a5041d34008a984b9ad53e4cd623a0ec9b5e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asternote.sty \
texlive-asternote"

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
