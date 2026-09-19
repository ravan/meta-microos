SUMMARY = "Typeset documents using base twelve numbering (also called 'dozenal')"
DESCRIPTION = "The package supports typesetting documents whose counters are \
represented in base twelve, also called 'dozenal'. It includes \
a macro by David Kastrup for converting positive whole numbers \
to dozenal from decimal (base ten) representation. The package \
also includes a few other macros and redefines all the standard \
counters to produce dozenal output. Fonts, in Roman, italic, \
slanted, and boldface versions, provide ten and eleven (the \
Pitman characters preferred by the Dozenal Society of Great \
Britain). The fonts were designed to blend well with the \
Computer Modern fonts, and are available both as Metafont \
source and in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2026.226.7.2svn75722"

RPM_NAME = "texlive-dozenal-2026.226.7.2svn75722-59.2.noarch.rpm"
RPM_HASH = "407d872617cc2fc7f9695b8f06dfa136596e632902dae69b24f52a037db3ce96485b7ce0286f6121b68c122a01d7b78bc4dbafb6c35299a8eb37f36b552709d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dozchars10.tfm \
tex-dozchars12.tfm \
tex-dozchars17.tfm \
tex-dozchars6.tfm \
tex-dozchars7.tfm \
tex-dozchars8.tfm \
tex-dozchars9.tfm \
tex-dozchb10.tfm \
tex-dozchbx10.tfm \
tex-dozchbx12.tfm \
tex-dozchbx5.tfm \
tex-dozchbx6.tfm \
tex-dozchbx7.tfm \
tex-dozchbx8.tfm \
tex-dozchbx9.tfm \
tex-dozchbxi10.tfm \
tex-dozchbxsl10.tfm \
tex-dozchit10.tfm \
tex-dozchit12.tfm \
tex-dozchit7.tfm \
tex-dozchit8.tfm \
tex-dozchit9.tfm \
tex-dozchsl10.tfm \
tex-dozchsl12.tfm \
tex-dozchsl8.tfm \
tex-dozchsl9.tfm \
tex-dozenal.map \
tex-dozenal.sty \
texlive-dozenal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fixltx2e.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-mfirstuc.sty \
tex-xstring.sty \
texlive \
texlive-dozenal-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
