SUMMARY = "A tool to manage claves of old literature with BibLaTeX"
DESCRIPTION = "When studying antique and medieval literature, we may find many \
different texts published with the same title, or, in contrary, \
the same text published with different titles. To avoid \
confusion, scholars have published claves, which are books \
listing ancient texts, identifying them by an identifier -- a \
number or a string of text. For example, for early \
Christianity, we have the Bibliotheca Hagiographica Graeca, the \
Clavis Apocryphorum Novi Testamenti and other claves. It could \
be useful to print the identifier of a texts in one specific \
clavis, or in many claves. The package allows us to create new \
field for different claves, and to present all these fields in \
a consistent way."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn76924"

RPM_NAME = "texlive-biblatex-claves-2026.226.1.2.1svn76924-61.2.noarch.rpm"
RPM_HASH = "2ceb94b5e5d75040b2dac943d46b7e7d11b979b32b8f30bdc0cca08172603588dfb242581f8e2d7ead73cc4d1f9a6b2ff34f5ee577f4d3668798f14188dc6760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-claves.bbx \
texlive-biblatex-claves"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
