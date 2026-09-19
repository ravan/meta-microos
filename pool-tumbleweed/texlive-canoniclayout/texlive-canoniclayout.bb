SUMMARY = "Create canonical page layouts with memoir"
DESCRIPTION = "A canonic text layout has specified relations to a circle \
inscribed within the enclosing page. The package allows the \
user to use a canonic layout with the memoir class."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn64889"

RPM_NAME = "texlive-canoniclayout-2026.226.1.0svn64889-59.2.noarch.rpm"
RPM_HASH = "3e40fcb3dbf9f478ce068ced4f1bc61ff7f946f1fda30e66334f29cefa7fe9c6e347bb0068117c535bd4ee5fbfdd036d5e574c07d1bf98f6de45b9f80a0ae5ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-canoniclayout.sty \
texlive-canoniclayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pict2e.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
