SUMMARY = "Fonts and LaTeX for Syriac written in Serto"
DESCRIPTION = "This package enables (La)TeX users to typeset words or phrases \
(e-TeX extensions are needed) in Syriac (Aramaic) using the \
Serto-alphabet. The package includes a preprocessor written in \
Python (>= 1.5.2) in order to deal with right-to-left \
typesetting for those who do not want to use elatex and to \
choose the correct letter depending on word context \
(initial/medial/final form). Detailed documentation and \
examples are included."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn74548"

RPM_NAME = "texlive-aramaic-serto-2026.226.1.3.2svn74548-61.2.noarch.rpm"
RPM_HASH = "6aa55b014255eccf4ed6d90eefe4a85b197126b7b2bbd1a2ae631a1f0671117d7399ea1db5be58e412bfe0b45ecf5adbb8f027d79d07c600f8178fc480629ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-assy.tfm \
tex-assyr.sty \
tex-assyrb10.tfm \
tex-serto.sty \
tex-serto10.tfm \
tex-sertob10.tfm \
tex-syriac.map \
tex-syriac.sty \
tex-uassyr.fd \
tex-userto.fd \
texlive-aramaic-serto"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-aramaic-serto-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
