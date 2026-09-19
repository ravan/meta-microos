SUMMARY = "A LaTeX cheat sheet"
DESCRIPTION = "A LaTeX reference sheet for writing scientific papers. Unlike \
many other such sheets, this sheet does not focus on \
typesetting mathematics (though it does list some symbols)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.13svn15878"

RPM_NAME = "texlive-latexcheat-2026.226.1.13svn15878-61.2.noarch.rpm"
RPM_HASH = "97b0ee4f9afc09e9e0093b9772f70f6c72c447350160fad3fb0e4a23f103e95b087843f956e41fc6cb91de7e70427a458ad4e8a33e09b12a2bcf6dce8c259502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
