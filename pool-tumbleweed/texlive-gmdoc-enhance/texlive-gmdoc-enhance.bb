SUMMARY = "Some enhancements to the gmdoc package"
DESCRIPTION = "This package provides some enhancements for the gmdoc package: \
nicer formatting for multiple line inline comments, an ability \
to 'comment out' some code, and a macro to input other files in \
'normal' LaTeX mode."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-gmdoc-enhance-2026.226.0.0.2svn15878-60.4.noarch.rpm"
RPM_HASH = "3452d8de6b398a21bd968410e9909f869a6cefa13f52543d2d69f633e2ce6984380c78c507487cd2a4ed70b4c928408bc3f0cd15ad5f7bd5f33b3f9f6a2d80e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmdoc-enhance.sty \
texlive-gmdoc-enhance"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-gmdoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
