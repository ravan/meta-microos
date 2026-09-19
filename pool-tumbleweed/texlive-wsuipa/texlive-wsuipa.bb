SUMMARY = "International Phonetic Alphabet fonts"
DESCRIPTION = "The package provides a 7-bit IPA font, as Metafont source, and \
macros for support under TeXt1 and LaTeX. The fonts (and \
macros) are now largely superseded by the tipa fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25469"

RPM_NAME = "texlive-wsuipa-2026.226.svn25469-59.4.noarch.rpm"
RPM_HASH = "a4c7d119c3479d29c2e3ec04c396b081ae2fd5c2b200606db0cb3a117ac3309d0fef1173bac2012effbb2ad5e9851e7d7ecc84f8f9c85099851fcd2a6553def5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ipa.sty \
tex-ipalmacs.sty \
tex-uipa.fd \
tex-wbxipa10.tfm \
tex-wbxipa11.tfm \
tex-wbxipa12.tfm \
tex-wbxipa17.tfm \
tex-wbxipa8.tfm \
tex-wbxipa9.tfm \
tex-wslipa10.tfm \
tex-wslipa11.tfm \
tex-wslipa12.tfm \
tex-wslipa17.tfm \
tex-wslipa8.tfm \
tex-wslipa9.tfm \
tex-wsuipa10.tfm \
tex-wsuipa11.tfm \
tex-wsuipa12.tfm \
tex-wsuipa17.tfm \
tex-wsuipa8.tfm \
tex-wsuipa9.tfm \
texlive-wsuipa"

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
