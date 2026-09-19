SUMMARY = "Typeset articles for the Annals of Mathematics"
DESCRIPTION = "The package provides a class for typesetting articles for The \
Annals of Mathematics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.36svn76110"

RPM_NAME = "texlive-aomart-2026.226.1.36svn76110-61.2.noarch.rpm"
RPM_HASH = "6703adb6af326a5e5bce41af4cdd1dfa055385e8c71927d21a4726161623d5a37d1759502da325ad31a6cfb0949502031a1e30d0baac9cf5be9d9dc446a8c964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aomart.cls \
texlive-aomart"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-strict \
sed \
tex-amsart.cls \
tex-cmtiup.sty \
tex-environ.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-lastpage.sty \
tex-yhmath.sty \
tex-zref-savepos.sty \
texlive \
texlive-aomart-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
