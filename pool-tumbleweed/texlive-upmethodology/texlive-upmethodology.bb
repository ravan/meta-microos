SUMMARY = "Writing specifications such as for UP-based methodologies"
DESCRIPTION = "The bundle allows the user to create Unified Process \
methodology (UP or RUP) based documents. The style provides \
document versioning, document history, document authors, \
document validators, specification description, task \
management, and several helping macros."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.20250429svn75054"

RPM_NAME = "texlive-upmethodology-2026.226.20250429svn75054-60.2.noarch.rpm"
RPM_HASH = "cf8644b4557ab05d9cf31f48f35cf1847f57ddb5ad1d2d27bb2b585f6f5e46786307e863b9262d09eb80b3a4f916c46468e1135c6f6a8740c8e3effea9c5d538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UPMVERSION.def \
tex-upmethodology-backpage.sty \
tex-upmethodology-code.sty \
tex-upmethodology-document.cls \
tex-upmethodology-document.sty \
tex-upmethodology-extension.sty \
tex-upmethodology-fmt.sty \
tex-upmethodology-frontpage.sty \
tex-upmethodology-p-common.sty \
tex-upmethodology-spec.sty \
tex-upmethodology-task.sty \
tex-upmethodology-version.sty \
texlive-upmethodology"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a4wide.sty \
tex-amsmath.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-bbm.sty \
tex-colortbl.sty \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-fancyhdr.sty \
tex-fontawesome5.sty \
tex-graphicx.sty \
tex-hyphenat.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-picinpar.sty \
tex-pifont.sty \
tex-relsize.sty \
tex-setspace.sty \
tex-stackengine.sty \
tex-subcaption.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-thmtools.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-tocbibind.sty \
tex-txfonts.sty \
tex-ulem.sty \
tex-url.sty \
tex-varioref.sty \
tex-vmargin.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xltabular.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
