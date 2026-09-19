SUMMARY = "A LuaTeX based package to handle Chinese text typesetting"
DESCRIPTION = "A LuaTeX package for Chinese character typesetting, covering \
horizontal/vertical, traditional/modern layout. Currently focus \
on Ancient Book replication. Implemented core logic of vertical \
typesetting, decorative elements of traditional Chinese books, \
and interlinear notes."
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.3.1svn78192"

RPM_NAME = "texlive-luatex-cn-2026.226.0.0.3.1svn78192-59.2.noarch.rpm"
RPM_HASH = "7629eb0ea583908338afa07f4fcd8a9986a16a4dc983417b28730b3786f5bf2503bcd21ef959e027ebe5a01f27a36fde2dbd6437a8411cbe056decc13ea16d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltc-cn-vbook.cls \
tex-ltc-guji-digital.cls \
tex-ltc-guji.cls \
tex-ltc-tw-vbook.cls \
tex-luatex-cn-banxin.sty \
tex-luatex-cn-core-base.sty \
tex-luatex-cn-core-column.sty \
tex-luatex-cn-core-content.sty \
tex-luatex-cn-core-document.sty \
tex-luatex-cn-core-export.sty \
tex-luatex-cn-core-metadata.sty \
tex-luatex-cn-core-page.sty \
tex-luatex-cn-core-paragraph.sty \
tex-luatex-cn-core-punct.sty \
tex-luatex-cn-core-sidenote.sty \
tex-luatex-cn-core-style.sty \
tex-luatex-cn-core-template.sty \
tex-luatex-cn-core-textbox.sty \
tex-luatex-cn-core-textflow.sty \
tex-luatex-cn-core.sty \
tex-luatex-cn-debug.sty \
tex-luatex-cn-decorate.sty \
tex-luatex-cn-digital.sty \
tex-luatex-cn-font-autodetect.sty \
tex-luatex-cn-footnote.sty \
tex-luatex-cn-guji-HongLouMengJiaXuBen.cfg \
tex-luatex-cn-guji-SiKuQuanShu-colored.cfg \
tex-luatex-cn-guji-cover.sty \
tex-luatex-cn-guji-danye.sty \
tex-luatex-cn-guji-default.cfg \
tex-luatex-cn-guji-jiazhu.sty \
tex-luatex-cn-guji-judou.sty \
tex-luatex-cn-guji-meipi.sty \
tex-luatex-cn-guji-mulu.sty \
tex-luatex-cn-guji-pizhu.sty \
tex-luatex-cn-guji-titlepage.sty \
tex-luatex-cn-guji-yinzhang.sty \
tex-luatex-cn-guji.sty \
tex-luatex-cn-linemark.sty \
tex-luatex-cn-tw-vbook-default.cfg \
tex-luatex-cn-vbook-default.cfg \
tex-luatex-cn.sty \
texlive-luatex-cn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-enumitem.sty \
tex-environ.sty \
tex-eso-pic.sty \
tex-expl3.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-luatexbase.sty \
tex-showframe.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
