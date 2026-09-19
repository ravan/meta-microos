SUMMARY = "LaTeX class for articles published in INGENIERIA review"
DESCRIPTION = "The class is for articles published in INGENIERIA review. It is \
derived from the standard LaTeX class article."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn38741"

RPM_NAME = "texlive-articleingud-2026.226.0.0.3svn38741-60.2.noarch.rpm"
RPM_HASH = "0604268b612b2231a7218ba1ff461838134ac7ab124ec30061af12fae1d0cb69d3a98b77ad134a3641129741bbaf28192df27d123628b0b63ef9c9b8cd9de6d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-articleingud.cls \
texlive-articleingud"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
