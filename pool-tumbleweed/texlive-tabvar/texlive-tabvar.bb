SUMMARY = "Typesetting tables showing variations of functions"
DESCRIPTION = "This LaTeX package is meant to ease the typesetting of tables \
showing variations of functions as they are used in France."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.8svn63921"

RPM_NAME = "texlive-tabvar-2026.227.1.8svn63921-62.2.noarch.rpm"
RPM_HASH = "f35640d7c2c2dd89dc6d581d65f0dbd678bfa66384801c6e4f05804d2caa2b27016aaf6802e220bc252ef05a4f5fc124e3b6e9067a47e8e308fee3c5d7ae6345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabvar.cfg \
tex-tabvar.map \
tex-tabvar.sty \
tex-tabvar.tfm \
texlive-tabvar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-colortbl.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-updmap.cfg \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tabvar-fonts"

inherit rpm
