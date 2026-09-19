SUMMARY = "Remove excess space at left and right of tabular"
DESCRIPTION = "The tabular environment is changed so that the outer \
\\tabcolseps are compensated and a \\hline has the same length as \
the text. No @{} is needed."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0asvn17885"

RPM_NAME = "texlive-tabularborder-2026.227.1.0asvn17885-62.2.noarch.rpm"
RPM_HASH = "8bef18a85b7ea4abc0c5aef0066cc3ff9214ca5b39ef56040fc2b5430dc9ecffb10e6cc8dc3d091457992f3a614a59f46bb5c90401d2b260d701f84ec5af510f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabularborder.sty \
texlive-tabularborder"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
