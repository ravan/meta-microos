SUMMARY = "Inhibit use of non-amsmath mathematics markup when using amsmath"
DESCRIPTION = "This package inhibits the usage of plain TeX and (on demand) of \
standard LaTeX mathematics environments. This is useful for \
class writers who want to encourage their users to use the \
environments provided by the amsmath package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20svn42927"

RPM_NAME = "texlive-onlyamsmath-2026.226.0.0.20svn42927-61.2.noarch.rpm"
RPM_HASH = "25951c20dfe2886fe6d64dfeaafc9f5bdcad1e2462f296a0891257a9c8768feeba12eb8742db9474755eda630575e0f6617a8ba30d79cdbe29fd0b1be548bf54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-onlyamsmath.sty \
texlive-onlyamsmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
