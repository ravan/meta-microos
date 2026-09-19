SUMMARY = "LaTeX support files for SDAPS"
DESCRIPTION = "This bundle contains LaTeX classes and packages to create \
machine readable questionnaires. Metadata is generated for the \
whole document and it is possible to process created forms \
fully automatically using the SDAPS main program. Features \
include: PDF Form generation Advanced array-like layout Can \
flow over multiple pages and repeats the header automatically \
Optional document wide alignment of array environments Has \
complex layout features like rotating the headers to safe space \
Ability to exchange rows and columns on the fly Different \
question types: Freeform text Single/multiple choice questions \
Range questions Layouting questions in rows or columns \
Possibility to pre-fill questionnaires from LaTeX"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.10svn76924"

RPM_NAME = "texlive-sdaps-2026.226.1.9.10svn76924-60.2.noarch.rpm"
RPM_HASH = "312ca766cbb6c70a1e3a763ddebbe6374d65fa8005a83f07405c79742e9bfc2db4388475d23f19f92e4ee30784554dafa72997aea81c357092c01cb108e7a66f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sdapsarray.sty \
tex-sdapsbase.sty \
tex-sdapsclassic.cls \
tex-sdapscode128.tex \
tex-sdapslayout.sty \
tex-sdapspdf.sty \
texlive-sdaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-babel.sty \
tex-color.sty \
tex-environ.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-lastpage.sty \
tex-qrcode.sty \
tex-refcount.sty \
tex-scrartcl.cls \
tex-scrkbase.sty \
tex-scrlayer-scrpage.sty \
tex-sectsty.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-translator.sty \
tex-url.sty \
tex-verbatim.sty \
tex-xparse.sty \
texlive \
texlive-environ \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lastpage \
texlive-pgf \
texlive-qrcode \
texlive-scripts \
texlive-scripts-bin \
texlive-sectsty \
texlive-translator"

inherit rpm
