SUMMARY = "Accept CSS-like selectors in tabular, array,"
DESCRIPTION = "This package reworks the internals of tabular, array, and \
similar constructs, and adds a \\cellprops command accepting \
CSS-like selectors and properties. It depends on mdwtab, \
xcolor, expl3, and xparse."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-cellprops-2026.226.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "2347e512bfa8aa06ef5a727d237f1f360a8c7d299d7797b06f1f2a2bcc61c2405d9f8cbd6b57cd01ac403fc0eea1f71c8ee7ec040b080a12309ddb5c5a870ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cellprops.sty \
texlive-cellprops"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-mdwtab.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
