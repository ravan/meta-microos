SUMMARY = "The LaTeX Tagging Status data"
DESCRIPTION = "TeX data of the tagging status derived from \
https://latex3.github.io/tagging-project/tagging-status/full. \
This will allow latex-lab to provide interfaces to check the \
status of packages used in a document."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77788"

RPM_NAME = "texlive-latex-tagging-status-2026.226.svn77788-63.2.noarch.rpm"
RPM_HASH = "5b1ed1ef491ee641aca665463cc7d95558fc662951f7cc77532a4a1644d62c88f6a64eb122ca385d1c1c38677eee7b2d45260d805e1647a3e36a94b493aa9be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-tagging-status"

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
