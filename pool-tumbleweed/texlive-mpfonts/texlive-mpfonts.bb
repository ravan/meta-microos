SUMMARY = "Computer Modern Type 3 fonts converted using MetaPost"
DESCRIPTION = "The Computer Modern fonts are available in Type 1 format, but \
these renditions are somewhat thin and spindly, and produce \
much lighter results than the originals. It is alternatively \
possible to use Metafont bitmaps, but this has its \
disadvantages in comparison with vector fonts. These fonts are \
conversions to Type 3 fonts, done entirely in MetaPost; they \
are vector fonts which are a direct conversion from the \
original Metafont files, so they are the design most authentic \
to the originals. However, these fonts, because they are \
PostScript Type 3 fonts, are not suitable for on-screen \
reading, and should probably only be used for printing. Note: \
do NOT add the map file to updmap!"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn54512"

RPM_NAME = "texlive-mpfonts-2026.226.svn54512-61.2.noarch.rpm"
RPM_HASH = "d3009f55bf6c0c21136e4894bb7f4c622877f977c193b324e311560536d89db78f5be220a1a195c57d8f9d12361dd01dad8198596f23dd4dd8b4ca1a250106df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mpfonts.map \
texlive-mpfonts"

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
