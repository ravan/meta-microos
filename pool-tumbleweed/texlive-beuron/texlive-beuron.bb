SUMMARY = "The script of the Beuronese art school"
DESCRIPTION = "This package provides the script used in the works of the \
Beuron art school for use with TeX and LaTeX. It is a \
monumental script consisting of capital letters only. The fonts \
are provided as Metafont sources, in the Type1 and in the \
OpenType format. The package includes suitable font selection \
commands for use with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn46374"

RPM_NAME = "texlive-beuron-2026.226.1.3svn46374-61.2.noarch.rpm"
RPM_HASH = "c9c301e642838dca999d6e867ae15e186de6922822620bd5b7437aadc87e7600c29d2b2b0b2ac7c7374c37f8a7ff262f57075426990392c44c04dfe7ca52f06d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beuron.map \
tex-beuron.sty \
tex-beuron.tfm \
tex-beuronc.tfm \
tex-beuronx.tfm \
tex-t1beuron.fd \
texlive-beuron"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fontspec.sty \
tex-updmap.cfg \
tex-xparse.sty \
texlive \
texlive-beuron-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
