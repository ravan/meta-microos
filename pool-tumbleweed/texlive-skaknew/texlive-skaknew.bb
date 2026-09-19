SUMMARY = "The skak chess fonts redone in Adobe Type 1"
DESCRIPTION = "This package offers Adobe Type 1 versions of the fonts provided \
as Metafont source by the skak bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-skaknew-2026.226.svn78101-64.2.noarch.rpm"
RPM_HASH = "cf9d0ea547b131584c943676cc13530e2c5c992cbeefbaa35fbe509f06cbd5ac928745e82a3f20ddc837d56a4f0f70274603008cdc4d2c59c5a0789752d086ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AlphaDia.tfm \
tex-SkakNew-Diagram.tfm \
tex-SkakNew-DiagramT.tfm \
tex-SkakNew-Figurine.tfm \
tex-SkakNew-FigurineBold.tfm \
tex-SkakNew.map \
texlive-skaknew"

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
texlive-skaknew-fonts"

inherit rpm
