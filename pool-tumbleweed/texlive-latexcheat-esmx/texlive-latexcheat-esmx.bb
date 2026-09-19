SUMMARY = "A LaTeX cheat sheet, in Spanish"
DESCRIPTION = "This is a translation to Spanish (Castellano) of Winston \
Chang's LaTeX cheat sheet (a reference sheet for writing \
scientific papers)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn36866"

RPM_NAME = "texlive-latexcheat-esmx-2026.226.2.00svn36866-61.2.noarch.rpm"
RPM_HASH = "514a2efd01b1e2e8d6b6ed088e4aa6b0b19d55ef21ce0364c3b9c1c0002e13b533698b9c751808236250acb99973d9c1322d83f95a0865fd16c55b19c8ef673a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat-esmx"

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
