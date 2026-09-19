SUMMARY = "A document class for typesetting homework assignments"
DESCRIPTION = "This document class was created for typesetting solutions to \
homework assignments at the university of Hamburg (Universitat \
Hamburg)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn44026"

RPM_NAME = "texlive-uhhassignment-2026.226.1.0svn44026-60.2.noarch.rpm"
RPM_HASH = "3ebf3121b8247f07327270e4e37956397e2d3ea4e21a5a1f63348f115e6f10f44f8dc699bdfa0cff5877733ad20e2ba0a02680ff69e0925a30f98ed4f765fd13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uhhassignment.cls \
texlive-uhhassignment"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-calc.sty \
tex-cmap.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-lmodern.sty \
tex-scrlayer-scrpage.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
