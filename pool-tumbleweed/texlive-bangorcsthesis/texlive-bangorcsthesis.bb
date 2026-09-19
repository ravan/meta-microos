SUMMARY = "Typeset a thesis at Bangor University"
DESCRIPTION = "The class typesets thesis/dissertation documents for all levels \
(i.e., both undergraduate and graduate students may use the \
class). It also provides macros designed to optimise the \
process of producing a thesis."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.7svn75154"

RPM_NAME = "texlive-bangorcsthesis-2026.226.1.5.7svn75154-60.2.noarch.rpm"
RPM_HASH = "eeb656e8dbcdbcf4b951a1a76c35f2602a87a051bd6160c6562c90c0cbeb019d077641d8ef2b0f6e2ec05dfce742ee48594a9eea15abd7cf713659787d8e9348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bangorcsthesis.cls \
texlive-bangorcsthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-babel.sty \
tex-berasans.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fifo-stack.sty \
tex-fontenc.sty \
tex-forloop.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-isodate.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-parskip.sty \
tex-report.cls \
tex-setspace.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-totalcount.sty \
tex-url.sty \
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
