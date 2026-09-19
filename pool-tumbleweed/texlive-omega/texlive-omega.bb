SUMMARY = "A wide-character-set extension of TeX"
DESCRIPTION = "A development of TeX, which deals in multi-octet Unicode \
characters, to enable native treatment of a wide range of \
languages without changing character-set. Work on Omega has \
ceased (the TeX Live package contains only support files); its \
compatible successor is aleph, which is itself also in major \
maintenance mode only. Ongoing projects developing Omega (and \
Aleph) ideas include Omega-2 and LuaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn33046"

RPM_NAME = "texlive-omega-2026.226.svn33046-61.2.noarch.rpm"
RPM_HASH = "a7aad9f0fbc68c04476d551607362464c528c03ac6ede3d4d91e17d074bcee7efa0ecfbcd9896e59558542178e6293d95a036717cd6350663934af55922db0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bghyph.tex \
tex-grlccode.tex \
tex-lthyph.tex \
tex-omding.tfm \
tex-omega.cfg \
tex-omega.map \
tex-omega.tex \
tex-omsea1.tfm \
tex-omsea1b.tfm \
tex-omsea2.tfm \
tex-omsea2b.tfm \
tex-omsea3.tfm \
tex-omsea3b.tfm \
tex-omseco.tfm \
tex-omsecob.tfm \
tex-omsecobi.tfm \
tex-omsecoi.tfm \
tex-omsecx.tfm \
tex-omsecy.tfm \
tex-omsegr.tfm \
tex-omsegrb.tfm \
tex-omsegrbi.tfm \
tex-omsegri.tfm \
tex-omseha.tfm \
tex-omseip.tfm \
tex-omsela.tfm \
tex-omselab.tfm \
tex-omselabi.tfm \
tex-omselai.tfm \
tex-omseti.tfm \
tex-omssti.tfm \
tex-srhyph.tex \
texlive-omega"

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
texlive-omega-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
