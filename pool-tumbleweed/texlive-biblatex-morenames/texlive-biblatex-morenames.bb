SUMMARY = "New names for standard BibLaTeX entry type"
DESCRIPTION = "This package adds new fields of 'name' type to the standard \
entry types of BibLaTeX. For example: maineditor, for a \
@collection, means the editor of @mvcollection, and not the \
editor of the @collection. bookineditor, for a @bookinbook, \
means the editor of the entry, and not, as the standard editor \
field, the editor of the volume in which the entry is \
contained."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1svn43049"

RPM_NAME = "texlive-biblatex-morenames-2026.226.1.3.1svn43049-61.2.noarch.rpm"
RPM_HASH = "6797643cb381dfb083b42d10a00724e10cabe6d3ac53caa6f11ab07b7c7af5236ac7023a1320677a8adf4f6f10c34983385e609e298a85cde4525234b1c98462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-morenames.bbx \
texlive-biblatex-morenames"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
