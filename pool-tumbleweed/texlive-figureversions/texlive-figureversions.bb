SUMMARY = "Figure versions for LaTeX"
DESCRIPTION = "The figureversions package defines several commands to switch \
between figure versions, which determine the appearance of \
numbers in your document. The package works with many font \
packages available on CTAN as well as with most OpenType fonts \
under XeTeX and LuaTeX in combination with fontspec."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn75069"

RPM_NAME = "texlive-figureversions-2026.226.1.0.1svn75069-59.2.noarch.rpm"
RPM_HASH = "efcdc75e826ba0904c23a72b1af6e4ac4322deb11ff54177996b5e7111c28f745ff4e75da88ef11692236687917e9dd2935b01ccc19fe47173795526b2e5b4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figureversions.sty \
texlive-figureversions"

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
