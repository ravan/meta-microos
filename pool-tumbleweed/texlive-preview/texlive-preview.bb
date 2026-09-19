SUMMARY = "Extract bits of a LaTeX source for output"
DESCRIPTION = "The package is a free-standing part of the preview-latex \
bundle. The package provides the support preview-latex needs, \
when it chooses the matter it will preview. The output may \
reasonably be expected to have other uses, as in html \
translators, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.14.0.6svn71662"

RPM_NAME = "texlive-preview-2026.226.14.0.6svn71662-59.2.noarch.rpm"
RPM_HASH = "1d38423fddf606759135f15eca6353d4945b0856c326879b59005835783e124426a116cd4b5bc32fe2623f86baeb3e2eb2d9dc0acd8804478faec8cae9276761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prauctex.cfg \
tex-prauctex.def \
tex-prcounters.def \
tex-preview.sty \
tex-prfootnotes.def \
tex-prlyx.def \
tex-prshowbox.def \
tex-prshowlabels.def \
tex-prtightpage.def \
tex-prtracingall.def \
texlive-preview"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatex85.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
