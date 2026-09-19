SUMMARY = "Embed non-PDF files into PDF with hyperlink"
DESCRIPTION = "The package allows to embed non-PDF files (e.g., BibTeX) into \
PDF with a hyperlink."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.1svn77682"

RPM_NAME = "texlive-intopdf-2026.226.0.0.4.1svn77682-60.2.noarch.rpm"
RPM_HASH = "80ec17ae4bf0cb25ef8c89369a1ec012c27ff046599b48f25ef88a75aff82facc7092cdc8d4c823128347f47306ad37252fd8fbc12aa6d6931b240fc9b1ca521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-intopdf.sty \
texlive-intopdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-hyperref.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
