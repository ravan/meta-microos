SUMMARY = "Thesis Template of Shandong University"
DESCRIPTION = "Thesis Template of Shandong University."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn41401"

RPM_NAME = "texlive-sduthesis-2026.226.1.2.1svn41401-60.2.noarch.rpm"
RPM_HASH = "88fd7c8d6bf0eacbb371ef090f0081ea57ab706249fda829892e6ed546e342082a00af42f2a3143591c384c5e5c708dc4e760ce28a3b225018746f2d0adb1055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sduthesis-cover.def \
tex-sduthesis-statement.def \
tex-sduthesis.cls \
texlive-sduthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bm.sty \
tex-bmpsize.sty \
tex-booktabs.sty \
tex-ctexbook.cls \
tex-epstopdf.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-makecell.sty \
tex-mathrsfs.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
