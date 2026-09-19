SUMMARY = "Package to encapsulate Sketch files in LaTeX sources"
DESCRIPTION = "The ESK package allows to encapsulate Sketch files in LaTeX \
sources. This is very useful for keeping illustrations in sync \
with the text. It also frees the user from inventing \
descriptive names for new files that fit into the confines of \
file system conventions. Sketch is a 3D scene description \
language by Eugene K. Ressler and can generate TikZ and \
PSTricks code. ESK behaves in a similar fashion to EMP (which \
encapsulates MetaPost files), and was in fact developed from \
it."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn18115"

RPM_NAME = "texlive-esk-2026.226.1.0svn18115-61.4.noarch.rpm"
RPM_HASH = "fa43ac664a6678b651896c6bdfe7a2810e4299111536ea361582665c5715fd538446cc01c0346b62ccb29c9ebaeeba7ce11a99f29f8008cd88930c1ce07fafdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esk.sty \
texlive-esk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvsetkeys.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
