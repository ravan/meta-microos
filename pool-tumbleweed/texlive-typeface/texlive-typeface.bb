SUMMARY = "Select a balanced set of fonts"
DESCRIPTION = "The package provides the means of establishing a consistent set \
of fonts for use in a LaTeX document. It allows mixing and \
matching the Type 1 font sets available on the archive (and it \
may be extended, via its configuration file, to support other \
fonts). Font-set definition takes the form of a set of options \
that are read when the package is loaded: for each typographic \
category (main body font, sans-serif font, monospace font, \
mathematics fonts, text figures, and so on), a font or a \
transformation is given in those options. The approach enables \
the user to remember their own configurations (as a single \
command) and to borrow configurations that other users have \
developed. The present release is designated 'for review'."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn27046"

RPM_NAME = "texlive-typeface-2026.226.0.0.1svn27046-59.2.noarch.rpm"
RPM_HASH = "2fc1b4cf725063eabfad19b40f431ddc76dcd0e570c985fe61dd86448a3ccc5c52c72e8a75c932f0d4b506d0eee156d6a08006849d580315c4ba86181a9aee1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typeface.cfg \
tex-typeface.sty \
texlive-typeface"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-array.sty \
tex-etexcmds.sty \
tex-etoolbox.sty \
tex-fix-cm.sty \
tex-fixmath.sty \
tex-fontenc.sty \
tex-ifetex.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-ifthenx.sty \
tex-mathtools.sty \
tex-nfssext-cfr.sty \
tex-scalefnt.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
