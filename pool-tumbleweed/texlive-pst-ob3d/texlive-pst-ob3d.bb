SUMMARY = "Three dimensional objects using PSTricks"
DESCRIPTION = "The package uses PSTricks to provide basic three-dimensional \
objects. As yet, only cubes (which can be deformed to \
rectangular parallelipipeds) and dies (which are only a special \
kind of cubes) are defined."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.22svn54514"

RPM_NAME = "texlive-pst-ob3d-2026.226.0.0.22svn54514-59.2.noarch.rpm"
RPM_HASH = "1486bd16554fdc01b9bf0cf4282c526e9f2ecbe857a103fdef28de19baee351ac4d75048950162093ae9dca9de3d541938757eadedb1705cdbda57a6a462c854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-ob3d.sty \
tex-pst-ob3d.tex \
texlive-pst-ob3d"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
