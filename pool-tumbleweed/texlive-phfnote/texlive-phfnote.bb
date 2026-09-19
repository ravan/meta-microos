SUMMARY = "Basic formatting for short documents"
DESCRIPTION = "This package provides basic formatting for short documents such \
as notes on a specific topic, short documentation, or quick \
memos. It aims to cover all basic needs for such purposes: \
include a standard set of relevant packages, a nice title which \
doesn't take up too much space, better page margin sizes, and \
some basic styling to make the note look nicer. At the same \
time, it is highly flexible and customizable."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn60733"

RPM_NAME = "texlive-phfnote-2026.226.4.0svn60733-58.2.noarch.rpm"
RPM_HASH = "fb477e6fd2c4d7b627c27bca3392408d57c7027b3dad80750ea159169aea7576a8c70e54150a1e6edc0dfbb6806d2eb97b540d852725cf800a565b2a9880cf75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfnote.sty \
tex-phfnotepreset-xpkgdoc.def \
texlive-phfnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-MnSymbol.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bbm.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-dsfont.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-fontenc.sty \
tex-fourier.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hypdoc.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-opensans.sty \
tex-sectsty.sty \
tex-setspace.sty \
tex-tcolorbox.sty \
tex-url.sty \
tex-verbdef.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
