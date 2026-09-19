SUMMARY = "Improve the performance of \\see macros with makeindex"
DESCRIPTION = "The package amends the \\see and \\seealso macros that are used \
in building indexes with makeindex, to deal with repetitions, \
and to ensure page numbers are present in the actual index \
entries."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-seealso-2026.226.1.2svn76924-60.2.noarch.rpm"
RPM_HASH = "557b9bb8fdc62ab164c5b3d772093d682456788a3f6783c95fce8854a4a17aa15971584b1ea84f5b666d57c4e4ab03a5e60849f832425d0cd1f496059a462626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-seealso.sty \
texlive-seealso"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
