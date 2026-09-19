SUMMARY = "Simple CD, DVD covers for printing"
DESCRIPTION = "The package provides printable cut-outs for various CD, DVD and \
other disc holders. The name of the package comes from its \
implementation and ease of use; it was designed just for text \
content, but since the text is placed in a \\parbox in a tabular \
environment cell, a rather wide range of things may be placed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn29260"

RPM_NAME = "texlive-simplecd-2026.226.1.4svn29260-60.2.noarch.rpm"
RPM_HASH = "2be05b5eae90c30c5f52a797d4ee77991a64d6309ac131e5946df2937e05f674c14a09e554d99cfb7f9b207b30d6861797f727c3ee094ec5bc6e92d4d70741b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplecd.sty \
texlive-simplecd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fix-cm.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
