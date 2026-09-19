SUMMARY = "Old German-style fonts, in Adobe type 1 format"
DESCRIPTION = "This package comprises type 1 versions of the Gothic, \
Schwabacher and Fraktur fonts of Yannis Haralambous' set of old \
German fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36013"

RPM_NAME = "texlive-yfonts-t1-2026.226.1.0svn36013-59.4.noarch.rpm"
RPM_HASH = "14b553a031c5f615e40920588897a0c32545531f2c4c10d6653b7d7673853a776cb82e59d829f988d2f901960e2546ff2cc99bfd58e328caf6257f702ce2002b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yfrak.map \
texlive-yfonts-t1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yfonts-t1-fonts"

inherit rpm
