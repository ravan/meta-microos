SUMMARY = "Class for printing fiction, such as novels"
DESCRIPTION = "This LuaLaTeX document class is specifically written to meet \
the needs of original fiction writers, who are typesetting \
their own novels for non-color print-on-demand technology. \
Built-in PDF/X is available, using new technology. The package \
is well suited for detective novels, science fiction, and short \
stories. It is however not recommended for creating color \
picture books or dissertations."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-novel-2026.226.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "f19e237719477ce1ae5e486ceae8c898f5cd5a8f5a1bd256e246df7a979fcb9c66e6b133b89f7c97100b4ebbddb2aa053c5650ab6f321d890fa39e1760e47010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-novel-CGATSTR001.clo \
tex-novel-CalculateLayout.sty \
tex-novel-ChapterScene.sty \
tex-novel-DropCap.sty \
tex-novel-FOGRA39.clo \
tex-novel-FileData.sty \
tex-novel-Fonts.sty \
tex-novel-Footnotes.sty \
tex-novel-HeadFootStyles.sty \
tex-novel-Images.sty \
tex-novel-JC200103.clo \
tex-novel-LayoutSettings.sty \
tex-novel-PostLayout.sty \
tex-novel-Sandbox.sty \
tex-novel-TextMacros.sty \
tex-novel-microtype.cfg \
tex-novel-pdfx.sty \
tex-novel-xmppacket.sty \
tex-novel.cls \
texlive-novel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-atbegshi.sty \
tex-babel.sty \
tex-calc.sty \
tex-changepage.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-fp.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-keyval.sty \
tex-letltxmacro.sty \
tex-lipsum.sty \
tex-luacode.sty \
tex-luatex85.sty \
tex-magaz.sty \
tex-microtype.sty \
tex-noindentafter.sty \
tex-pdfpages.sty \
tex-pdftexcmds.sty \
tex-polyglossia.sty \
tex-silence.sty \
tex-textpos.sty \
tex-unicode-math.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-novel-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
