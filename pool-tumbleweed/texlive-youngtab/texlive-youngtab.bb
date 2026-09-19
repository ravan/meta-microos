SUMMARY = "Typeset Young-Tableaux"
DESCRIPTION = "A package for typesetting Young-Tableaux, mathematical symbols \
for the representations of groups, providing two macros, \
\\yng(1) and \\young(1) to generate the whole Young-Tableau."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-youngtab-2026.226.1.1svn77682-59.4.noarch.rpm"
RPM_HASH = "ca235392524b8df69416d34a9a6a6a5aa46f7301ac69f76e4775e4ad0fc948d77c712d5e7e0e66749b3ce92ed17bbe4b2f6205a0396beffb37f293b0896b000a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-youngtab.sty \
texlive-youngtab"

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
