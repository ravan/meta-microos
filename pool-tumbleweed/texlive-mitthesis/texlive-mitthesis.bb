SUMMARY = "A LaTeX template for an MIT thesis"
DESCRIPTION = "This class provides a LaTeX template for an MIT thesis or \
dissertation formatted according to the requirements of the \
Massachusetts Institute of Technology Libraries (as posted in \
2025): \
https://libraries.mit.edu/distinctive-collections/thesis-specs/ \
This template is appropriate for an MIT thesis or MIT \
dissertation of any type. This template works with either \
pdfLaTeX or LuaLaTeX. The bibliography may be prepared with \
biblatex/biber. The class requires TeX Live 2022 or later \
distributions. This template replaces the older version of \
mitthesis.cls, which was first composed in the 1980s."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.22svn77682"

RPM_NAME = "texlive-mitthesis-2026.226.1.22svn77682-61.2.noarch.rpm"
RPM_HASH = "ac336ab0f7d0c6515ef3caa780dce599383f7440f86136e560936f44cb343ca0518905e05ad8688447da5a921cec251e5945645f8a39e1c1a5b59cee176bcb69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mitthesis.cls \
texlive-mitthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bm.sty \
tex-doi.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-lineno.sty \
tex-mathtools.sty \
tex-report.cls \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
