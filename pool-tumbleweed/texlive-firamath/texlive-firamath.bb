SUMMARY = "Fira sans serif font with Unicode math support"
DESCRIPTION = "Fira Math is a sans-serif font with Unicode math support. The \
design of this font is based on Fira Sans and FiraGO. Fira Math \
is distributed in OpenType format and can be used with the \
unicode-math package under XeLaTeX or LuaLaTeX. More support is \
offered by the firamath-otf package."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.3.4svn56672"

RPM_NAME = "texlive-firamath-2026.226.0.0.3.4svn56672-59.2.noarch.rpm"
RPM_HASH = "c495e697a9713332b599d8b659f874e4a6a87b774666fa8d7d31721a02c457140e0c88a6f74075abbef304ffbf031d452da28beab02a0d73b66e64fc3c467df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firamath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-firamath-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
