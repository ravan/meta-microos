SUMMARY = "Correct placement of accents in sans-serif maths"
DESCRIPTION = "Sans serif maths (produced by the beamer class or the sfmath \
package) often has accents positioned incorrectly. This package \
fixes the positioning of such accents when the default font \
(cmssi) is used for sans serif maths. It will have no effect if \
used in a document that does not use the beamer class or the \
sfmath package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-sansmathaccent-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "50b46dc495db34ed64777d5f9024d31175a1b863946129ffc7441a2b54cdef95edc8ada32e4eb732b7f0506b249882d86a6fc8bb7943d60a3bbe61265fa88f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathkerncmssi10.tfm \
tex-mathkerncmssi12.tfm \
tex-mathkerncmssi17.tfm \
tex-mathkerncmssi8.tfm \
tex-mathkerncmssi9.tfm \
tex-mathkerncmssxi10.tfm \
tex-mathkerncmssxi10.vf \
tex-mathkerncmssxi12.tfm \
tex-mathkerncmssxi12.vf \
tex-mathkerncmssxi17.tfm \
tex-mathkerncmssxi17.vf \
tex-mathkerncmssxi8.tfm \
tex-mathkerncmssxi8.vf \
tex-mathkerncmssxi9.tfm \
tex-mathkerncmssxi9.vf \
tex-ot1mathkerncmss.fd \
tex-sansmathaccent.map \
tex-sansmathaccent.sty \
texlive-sansmathaccent"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmssbx10.tfm \
tex-ecso0800.tfm \
tex-ecso0900.tfm \
tex-ecso1000.tfm \
tex-ecso1200.tfm \
tex-ecso1728.tfm \
tex-scrlfile.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
