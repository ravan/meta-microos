SUMMARY = "Extend math family up to 256 for pLaTeX/upLaTeX/Lamed"
DESCRIPTION = "This package increases the upper limit of math symbols up to \
256, using \\omath... primitives. These primitives were \
originally introduced in Omega and are currently available in \
the following formats: pLaTeX (runs on e-pTeX), upLaTeX (runs \
on e-upTeX), Lamed (runs on Aleph, successor of Omega)."
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.5svn53519"

RPM_NAME = "texlive-mathfam256-2026.226.0.0.5svn53519-59.2.noarch.rpm"
RPM_HASH = "aebe329c18eb6dcc360e9197907e2515512c62f93843db7eb5588936fe0b76c94f03a366ce995337cde200a273bff3c811ab78a516cb1351c6cfcacd487bd67c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathfam256.sty \
texlive-mathfam256"

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
