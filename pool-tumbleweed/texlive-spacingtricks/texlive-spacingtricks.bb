SUMMARY = "Addressing various spacing issues"
DESCRIPTION = "This package provides macros for addressing various spacing \
issues, including: centering a single line creating a variable \
strut indenting a block typesetting a compact list placing two \
boxes side by side with vertical adjustment"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn69048"

RPM_NAME = "texlive-spacingtricks-2026.226.1.8svn69048-64.2.noarch.rpm"
RPM_HASH = "c4db2c5fcf39b719de0ae62f94a70791cc365df58dd338565234426d9602a11ee46edde0316f112a62ca33eaa743174c1071f40cc032e4923d5fc2f2228d003e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spacingtricks.sty \
texlive-spacingtricks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-centeredline.sty \
tex-ifthen.sty \
tex-pifont.sty \
tex-setspace.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
