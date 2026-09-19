SUMMARY = "Facilitates writing/editing of multiaccented greek"
DESCRIPTION = "The greektonoi mapping extends the betababel package or the \
babel polutonikogreek option to provide a simple way to insert \
ancient Greek texts with diacritical characters into your \
document using a similar method to the commonly used Beta Code \
transliteration, but with much more freedom. It is designed \
especially for the XeTeX engine and it could also be used for \
fast and easy modification of monotonic greek texts to \
polytonic. The output text is natively encoded in Unicode, so \
it can be reused in any possible way. The greektonoi package \
provides, in addition to inserting greek accents and \
breathings, many other symbols used in greek numbers and \
arithmetic or in the greek archaic period. It could be used \
with greektonoi mapping or indepedently."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.svn39419"

RPM_NAME = "texlive-greektonoi-2026.226.svn39419-60.4.noarch.rpm"
RPM_HASH = "637d3a6a104c83e2d0d996b7940832ae54a7048c8ad39881fd81e3649088d1d56b57c91fc9ab95a1b5cd9f1e854c92bbf5b998e2bb894d433396afd8d60c2bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greektonoi.map \
tex-greektonoi.sty \
texlive-greektonoi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
