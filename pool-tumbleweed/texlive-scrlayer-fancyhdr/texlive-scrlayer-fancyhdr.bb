SUMMARY = "Combining fancyhdr with KOMA-Script's scrlayer"
DESCRIPTION = "This LaTeX package uses KOMA-Script's scrlayer to redefine the \
page styles of package fancyhdr. This allows the combination of \
features of fancyhdr with features of scrlayer. Before \
KOMA-Script v3.33 scrlayer-fancyhdr was part of KOMA-Script \
itself."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn73851"

RPM_NAME = "texlive-scrlayer-fancyhdr-2026.226.0.0.4svn73851-60.2.noarch.rpm"
RPM_HASH = "200a7d962ed00ebbce449b484b24344ce47d0f9a901c7293ca5a195d89d0cfe6ff02e6452ef959cf82f772b8cb2c34319374520f910d04e97554e9b480870a5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scrlayer-fancyhdr.sty \
texlive-scrlayer-fancyhdr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-scrlayer.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
