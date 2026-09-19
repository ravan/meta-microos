SUMMARY = "Conversion of TeX dimensions to decimals"
DESCRIPTION = "Utilities and documentation related to TeX dimensional units, \
usable both with Plain (\\input texdimens) and with LaTeX \
(\\usepackage{texdimens})."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn77682"

RPM_NAME = "texlive-texdimens-2026.227.1.1svn77682-62.2.noarch.rpm"
RPM_HASH = "0684d0c9171fcf704f667b151d2efd0fbe0b702c7f20621819da7c47c0f74dfb95addbb807621f850a633913499ce1b50a885384ce74e71e2b61e7364e37d928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texdimens.sty \
tex-texdimens.tex \
texlive-texdimens"

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
