SUMMARY = "Layout graphic rich documents"
DESCRIPTION = "The pagelayout class enables you to layout pages declaratively \
using simple macros for pages, covers, grids, templates, text, \
and graphics to create graphic rich, perfectly typeset, and \
print ready PDFs. The integration of Inkscape allows you to \
create box shadows. The integration of ImageMagick allows you \
to configure compression and sharpening for bitmap graphics to \
export web, print or preview versions of your document. \
Parallelized image optimization, caching, and a draft mode \
enable fast PDF creation and a responsive workflow, even for \
large documents with lots of photos and graphics. The \
pagelayout class also integrates the PGF/TikZ and tcolorbox \
LaTeX packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn71937"

RPM_NAME = "texlive-pagelayout-2026.226.1.1.1svn71937-58.2.noarch.rpm"
RPM_HASH = "23b74cd3df905ae7a36afbc3d3d9e411fcfab00bd31dbb37d82c237e5999be10335f20cad55a5a4bbf0037a6371bfa11a393d5886a01e457f20f2f499596955e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagelayout.cls \
texlive-pagelayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfopts.sty \
tex-standalone.cls \
tex-tcolorbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pagelayout-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
