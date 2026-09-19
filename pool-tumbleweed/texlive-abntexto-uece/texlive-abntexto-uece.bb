SUMMARY = "LaTeX class for formatting academic papers in UECE standards"
DESCRIPTION = "This is a unofficial LaTeX class created for Brazilian students \
to facilitate the use of standards from the Universidade \
Estadual do Ceara (UECE) in academic works like TCCs, \
dissertations, and theses."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn76157"

RPM_NAME = "texlive-abntexto-uece-2026.226.1.0svn76157-61.2.noarch.rpm"
RPM_HASH = "fe1d2e6c7158789cdb5fb0e6653dcebe649d72f128817b62dde520fdcd5cb496d41cecb9ebfe3d6151decaea0275e8176f3a2a22e584b012c7fc1bf5b3b38ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abntexto-uece.cls \
texlive-abntexto-uece"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abntexto.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
