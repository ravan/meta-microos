SUMMARY = "SymbolsADF with TeX/LaTeX support"
DESCRIPTION = "The package provides Arkandis foundry's ArrowsADF and \
BulletsADF fonts in Adobe Type 1 format, together with \
TeX/LaTeX support files."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn78141"

RPM_NAME = "texlive-adfsymbols-2026.226.1.5svn78141-61.2.noarch.rpm"
RPM_HASH = "487245709cd5a7c33b2f2461832c08e5279e3d64f9d56ff34b4e4763e3e62b322b26d5415677dd641cbfea9c4d1b33d4ab6ab59cb69600f61e4d4355833e4347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ArrowsADF.tfm \
tex-BulletsADF.tfm \
tex-SymbolsADF.enc \
tex-adfarrows.sty \
tex-adfbullets.sty \
tex-adfsymbols-uni.tex \
tex-adfsymbols.map \
tex-uarrowsadf.fd \
tex-ubulletsadf.fd \
texlive-adfsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fixtounicode.sty \
tex-l3keys2e.sty \
tex-svn-prov.sty \
tex-updmap.cfg \
texlive \
texlive-adfsymbols-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
