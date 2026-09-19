SUMMARY = "A parametric questions' repositories framework"
DESCRIPTION = "This is a personal pre-configuration package which \
(selectively) loads package sets with package options \
pre-defined by the author."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0bsvn77050"

RPM_NAME = "texlive-afperpack-2026.226.1.0bsvn77050-61.2.noarch.rpm"
RPM_HASH = "6f47329834caa4d8f64049d2d8c2d716fbf682e36c1882b113c206b44d8d98babf0f8bfe7fcbddb257ac1c4fcb1404976d192b0a4c3353c17a457144623ad051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afperpack.sty \
texlive-afperpack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-bigdelim.sty \
tex-caption.sty \
tex-cases.sty \
tex-circuitikz.sty \
tex-csquotes.sty \
tex-empheq.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-extarrows.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-mathfixs.sty \
tex-mathptmx.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-multirow.sty \
tex-pgfplots.sty \
tex-pkginfograb.sty \
tex-showframe.sty \
tex-showlabels.sty \
tex-siunitx.sty \
tex-steinmetz.sty \
tex-subcaption.sty \
tex-tikzdotncross.sty \
tex-tikzfxgraph.sty \
tex-tikzquads.sty \
tex-tikzquests.sty \
tex-titlesec.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
