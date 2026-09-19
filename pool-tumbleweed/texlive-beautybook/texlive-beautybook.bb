SUMMARY = "A beautiful book template for maths and science"
DESCRIPTION = "The package contains a LaTeX class as well as style files for \
creating beautiful science books."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-beautybook-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "b82682e85cf1d8ce2c8300ce2416c529dbce6f14f68d591131000a57acbf5ed5a90ba4bf82ad9f6bb37f3b700841408a80ef1a6616964b15cc926257e9c39e4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beautybook-bottompage.sty \
tex-beautybook-cover-birkar.sty \
tex-beautybook-cover-cn.sty \
tex-beautybook-cover-en.sty \
tex-beautybook-cover-enfig.sty \
tex-beautybook.cls \
texlive-beautybook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-appendix.sty \
tex-bm.sty \
tex-bropd.sty \
tex-caption.sty \
tex-cncolours.sty \
tex-ean13isbn.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-extarrows.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-imakeidx.sty \
tex-indentfirst.sty \
tex-mathrsfs.sty \
tex-ninecolors.sty \
tex-pifont.sty \
tex-scrlayer-scrpage.sty \
tex-tabularray.sty \
tex-tcolorbox.sty \
tex-thm-restate.sty \
tex-thmtools.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-upgreek.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
