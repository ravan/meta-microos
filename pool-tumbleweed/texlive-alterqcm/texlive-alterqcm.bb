SUMMARY = "Multiple choice questionnaires in two column tables"
DESCRIPTION = "The alterqcm package is a LaTeX2e package, for making multiple \
choices questionnaires in a table with two columns. The aim is \
to provide some useful macros to build QCM in tables. These \
macros may be used by only LaTeX TeX users. The package works \
with utf8, pdfLaTeX, LuaLaTeX and XeLaTeX (with some \
languages). The documentation is in English."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.42csvn59265"

RPM_NAME = "texlive-alterqcm-2026.226.4.42csvn59265-61.2.noarch.rpm"
RPM_HASH = "e3323790bae29fe621d3cc3fca156fec873315119f82318d194a118cf9f64dfea838cece1090c45d27a6437491fa17de0c82b4d0fd571944ea236fd0b70fcf50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alterqcm.sty \
texlive-alterqcm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-multirow.sty \
tex-pifont.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
