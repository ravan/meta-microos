SUMMARY = "Template for YB Branded Books"
DESCRIPTION = "This template helps the author design books published on Amazon \
under the 'Y.B.' brand. You are welcome to use it too for your \
own books."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.5svn74649"

RPM_NAME = "texlive-yb-book-2026.226.0.0.6.5svn74649-59.4.noarch.rpm"
RPM_HASH = "178ae7bcf35ff6817cb2b6f52771048b6c7faf35ebd12f39b80266129946a47b618aafb5bc6a19a4eb00dc1a8bc5c49ac1fdd292aae013722880beed1337e29f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yb-book.cls \
texlive-yb-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-biblatex.sty \
tex-book.cls \
tex-changepage.sty \
tex-chngcntr.sty \
tex-csquotes.sty \
tex-doi.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-href-ul.sty \
tex-imakeidx.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-libertine.sty \
tex-mdframed.sty \
tex-microtype.sty \
tex-paralist.sty \
tex-perpage.sty \
tex-pgfopts.sty \
tex-setspace.sty \
tex-soul.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-ulem.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xfp.sty \
tex-xifthen.sty \
texlive \
texlive-anyfontsize \
texlive-biblatex \
texlive-bigfoot \
texlive-changepage \
texlive-chngcntr \
texlive-collection-fontsextra \
texlive-collection-fontsrecommended \
texlive-csquotes \
texlive-cyrillic \
texlive-doi \
texlive-enumitem \
texlive-fancyhdr \
texlive-filesystem \
texlive-float \
texlive-footmisc \
texlive-geometry \
texlive-href-ul \
texlive-hypdoc \
texlive-ifmtarg \
texlive-imakeidx \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lastpage \
texlive-lh \
texlive-libertine \
texlive-mdframed \
texlive-microtype \
texlive-needspace \
texlive-paralist \
texlive-pgf \
texlive-pgfopts \
texlive-qrcode \
texlive-scripts \
texlive-scripts-bin \
texlive-setspace \
texlive-soul \
texlive-textpos \
texlive-titlesec \
texlive-ulem \
texlive-wrapfig \
texlive-xcolor \
texlive-xifthen \
texlive-xkeyval \
texlive-zref"

inherit rpm
