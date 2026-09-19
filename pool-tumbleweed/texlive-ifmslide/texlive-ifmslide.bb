SUMMARY = "Presentation slides for screen and printouts"
DESCRIPTION = "This package is used to produce printed slides with LaTeX and \
online presentations with pdfLaTeX. It is provided by the \
'Institute of Mechanics' (ifm) Univ. of Technology Darmstadt, \
Germany. It is based on ideas of pdfslide, but completely \
rewritten for compatibility with texpower and seminar. The \
manual describes all functions and provides a sample."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.47svn20727"

RPM_NAME = "texlive-ifmslide-2026.226.0.0.47svn20727-60.2.noarch.rpm"
RPM_HASH = "46481e30b19de6ea21ced4a89449f9b8747969481ad137c88fe078f2f1f5a8fef25c1b9c9fe67fb24c267971520b2220c7a64f1a9607ce9861aa242d5e978df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifmslide.cfg \
tex-ifmslide.sty \
texlive-ifmslide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-color.sty \
tex-fixseminar.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-texpower.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
