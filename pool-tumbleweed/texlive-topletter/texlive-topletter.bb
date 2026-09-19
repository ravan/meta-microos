SUMMARY = "Letter class for the Politecnico di Torino"
DESCRIPTION = "This package provides a LaTeX class for typesetting letters \
conforming to the official Corporate Image guidelines for the \
Politecnico di Torino. The class can be used for letters \
written in Italian and in English."
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.3.0svn48182"

RPM_NAME = "texlive-topletter-2026.226.0.0.3.0svn48182-59.2.noarch.rpm"
RPM_HASH = "c7f36803caa9d4607578abb721e0ae84f53a707999c9ae0d5c6342bcc3358585f78d60f0a141741f329288be6dabf174fd143710bd982deda49bed4524866e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TOPletter.cls \
texlive-topletter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-changepage.sty \
tex-color.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-iflang.sty \
tex-inputenc.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
