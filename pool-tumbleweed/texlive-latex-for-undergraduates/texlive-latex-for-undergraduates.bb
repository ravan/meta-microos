SUMMARY = "A tutorial aimed at introducing undergraduate students to LaTeX"
DESCRIPTION = "A tutorial aimed at introducing undergraduate students to \
LaTeX, including an introduction to LaTeX Workshop in Visual \
Studio Code and an example package of user-defined LaTeX \
commands."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0.3svn70199"

RPM_NAME = "texlive-latex-for-undergraduates-2026.226.1.0.3svn70199-63.2.noarch.rpm"
RPM_HASH = "92148427a72a0173d587fa5500f834ae5c66cdf7973fcf56cc13843515f5bf378560bf6528aa7c65de44e9ea64623f0d4130c6f1973bb73e448b828632885a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-for-undergraduates"

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
