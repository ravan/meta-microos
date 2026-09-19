SUMMARY = "Upright digits in Adobe Utopia Italic"
DESCRIPTION = "The Annals of Mathematics uses italics for theorems. However, \
slanted digits and parentheses look disturbing when surrounded \
by (upright) mathematics. This package provides virtual fonts \
with italics and upright digits and punctuation, as an \
extension to Mathdesign's Utopia bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn20298"

RPM_NAME = "texlive-mdputu-2026.226.1.2svn20298-59.2.noarch.rpm"
RPM_HASH = "d0bb1f92fc351d1cb75d4bd0c1e46c33c769de07de506ef5334548786dd3bb7b8ffaa18918577d6d395f309766aeec2274b6b70faab18f9e496cd165e6491489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mdputu.sty \
tex-mdputubi7t.tfm \
tex-mdputubi7t.vf \
tex-mdputubi8t.tfm \
tex-mdputubi8t.vf \
tex-mdputuri7t.tfm \
tex-mdputuri7t.vf \
tex-mdputuri8t.tfm \
tex-mdputuri8t.vf \
tex-ot1mdputu.fd \
tex-t1mdputu.fd \
texlive-mdputu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mdputb7t.tfm \
tex-mdputb8t.tfm \
tex-mdputbi7t.tfm \
tex-mdputbi8t.tfm \
tex-mdputr7t.tfm \
tex-mdputr8t.tfm \
tex-mdputri7t.tfm \
tex-mdputri8t.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
