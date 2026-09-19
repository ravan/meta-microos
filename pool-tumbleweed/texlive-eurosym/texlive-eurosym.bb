SUMMARY = "Metafont and macros for Euro sign"
DESCRIPTION = "The European currency symbol for the Euro implemented in \
Metafont, using the official European Commission dimensions, \
and providing several shapes (normal, slanted, bold, outline). \
The package also includes a LaTeX package which defines the \
macro, pre-compiled tfm files, and documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4_subrfixsvn78101"

RPM_NAME = "texlive-eurosym-2026.226.1.4_subrfixsvn78101-59.2.noarch.rpm"
RPM_HASH = "b8897135eaf4fdce5472d7bd6409bdcf4285ad84623dc32e506ce9cac09811a5dda9b686c18d2ee16e82fe6c9218b07f1c240e8cee403f81f30233445fd4f88b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eurosym.map \
tex-eurosym.sty \
tex-feybl10.tfm \
tex-feybo10.tfm \
tex-feybr10.tfm \
tex-feyml10.tfm \
tex-feymo10.tfm \
tex-feymr10.tfm \
texlive-eurosym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-eurosym-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
