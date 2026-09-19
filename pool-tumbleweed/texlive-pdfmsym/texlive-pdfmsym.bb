SUMMARY = "PDF Math Symbols -- various drawn mathematical symbols"
DESCRIPTION = "This package defines a handful of mathematical symbols many of \
which are implemented via PDF's builtin drawing utility. It is \
intended for use with pdfTeX and LuaTeX and is supported by \
XeTeX to a lesser extent. Among the symbols it defines are some \
variants of commonly used ones, as well as more obscure symbols \
which cannot be as easily found in other TeX or LaTeX packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn66618"

RPM_NAME = "texlive-pdfmsym-2026.226.1.1.1svn66618-58.2.noarch.rpm"
RPM_HASH = "c81f15a6d5e0653ed5e6e1ebaf1cd679c8a920218af536b8f5bbb1dea6a8813aa3dbb3cb0e3852123c37309f20c5fe2c8ccaabba07f1111b2d5d58fe3c2b5b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfmsym.tex \
texlive-pdfmsym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
