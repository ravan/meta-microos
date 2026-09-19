SUMMARY = "Sources for the European Concrete fonts"
DESCRIPTION = "The Metafont sources and TFM files of the European Concrete \
Fonts. This is the T1-encoded extension of Knuth's Concrete \
fonts, including also the corresponding text companion fonts. \
Adobe Type 1 versions of the fonts are available as part of the \
cm-super font bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-ecc-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "04534405742cf14e2814c98db1c905b51b9f9679b383a238ce5a0921660ab9cab6e3a3c30481488830c6ab119c8d0a14f8fbe50179bb00d5a2d1721cb0c45fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eocc10.tfm \
tex-eorm10.tfm \
tex-eorm5.tfm \
tex-eorm6.tfm \
tex-eorm7.tfm \
tex-eorm8.tfm \
tex-eorm9.tfm \
tex-eosl10.tfm \
tex-eosl5.tfm \
tex-eosl6.tfm \
tex-eosl7.tfm \
tex-eosl8.tfm \
tex-eosl9.tfm \
tex-eoti10.tfm \
tex-tcssdc10.tfm \
tex-torm10.tfm \
tex-torm5.tfm \
tex-torm6.tfm \
tex-torm7.tfm \
tex-torm8.tfm \
tex-torm9.tfm \
tex-tosl10.tfm \
tex-tosl5.tfm \
tex-tosl6.tfm \
tex-tosl7.tfm \
tex-tosl8.tfm \
tex-tosl9.tfm \
tex-toti10.tfm \
texlive-ecc"

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
