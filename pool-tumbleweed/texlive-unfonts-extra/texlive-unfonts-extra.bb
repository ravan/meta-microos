SUMMARY = "TrueType version of Un-fonts"
DESCRIPTION = "The Un-fonts come from the HLaTeX as type1 fonts in 1998 by \
Koaunghi Un, he made type1 fonts to use with Korean TeX \
(HLaTeX) in the late 1990's and released it under the GPL \
license. They were converted to TrueType with the FontForge \
(PfaEdit) by Won-kyu Park in 2003. Extra families (10 fonts): \
UnPen, UnPenheulim: script UnTaza: typewriter style UnBom: \
decorative UnShinmun UnYetgul: old Korean printing style \
UnJamoSora, UnJamoNovel, UnJamoDotum, UnJamoBatang"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn56291"

RPM_NAME = "texlive-unfonts-extra-2026.226.svn56291-60.2.noarch.rpm"
RPM_HASH = "162d87be4840d04e41ffadfa3897e9adb8fdf2521fa166b690eaf1b106a62e0ec3653a14ddaf8887faa90b45fe9b94cfe43cd25910f2be94d18c5aa8a6a9677f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-extra"

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
texlive-scripts-bin \
texlive-unfonts-extra-fonts"

inherit rpm
