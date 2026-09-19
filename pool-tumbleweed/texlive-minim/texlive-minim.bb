SUMMARY = "A modern plain format for the LuaTeX engine"
DESCRIPTION = "This is a modern plain format for the LuaTeX engine, adding \
improved low-level support for many LuaTeX extensions and newer \
PDF features. While it can be used as drop-in replacement for \
plain TeX, it probably is most useful as a basis for your own \
formats. Most features included in the format are provided by \
separate packages that can be used on their own; see the \
packages minim-mp for mplib (MetaPost) support minim-math for \
unicode mathematics minim-pdf for creating Tagged PDF minim-xmp \
for XMP (metadata) inclusion This package contains only their \
shared lowest-level programming interface, along with their \
combined format."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_1.7svn73816"

RPM_NAME = "texlive-minim-2026.226.2025_1.7svn73816-61.2.noarch.rpm"
RPM_HASH = "b024e909723f68b975fc82272ea2b715e2ce427161872206b3484a08d65b5793677052f70e5a51d06289deda54a48647bbfbd311e3e89f547e9a06f3949faf59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minim-alloc.tex \
tex-minim-doc.sty \
tex-minim-etex.tex \
tex-minim-lmodern.tex \
tex-minim-pdfresources.tex \
tex-minim-plain.tex \
tex-minim.tex \
texlive-minim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luaotfload.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
