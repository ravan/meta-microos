SUMMARY = "A LaTeX class for theses at the Faculty Of Graphic Arts in Zagreb"
DESCRIPTION = "This class is intended for generating graduate and final theses \
according to the instructions of the Faculty of Graphic Arts, \
University of Zagreb. It does not necessarily correspond to the \
requirements of each component of the University, but is \
designed as an idea for linking and uniformizing the look of \
all graduate papers. Anyone who likes it is welcome to use it."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51647"

RPM_NAME = "texlive-unizgklasa-2026.226.1.0svn51647-60.2.noarch.rpm"
RPM_HASH = "f2987eca330d363e4591126f35f149ea45b11e44d2ef34bbfe26f16e7cb81e5f5c6cc615da58ba701655d35234bb41d9bcb45b13556ff75013d74111cf1ca80e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unizgklasa.cls \
texlive-unizgklasa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-caption.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-subcaption.sty \
tex-titlesec.sty \
tex-tocbibind.sty \
tex-upgreek.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
