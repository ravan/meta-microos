SUMMARY = "A maths symbol font"
DESCRIPTION = "FdSymbol is a maths symbol font, designed as a companion to the \
Fedra family by Typotheque, but it might also fit other \
contemporary typefaces."
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-fdsymbol-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "e5360405525cb2638eb4f9226192da0c8463056e8c51d8e97aba3eb05a60075078fa6186c8e9b3f8461eaeef7d15294b2bd6645b599adf6c77f4100ababb0fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-FdSymbolA-Bold.tfm \
tex-FdSymbolA-Book.tfm \
tex-FdSymbolA-Demi.tfm \
tex-FdSymbolA-Medium.tfm \
tex-FdSymbolB-Bold.tfm \
tex-FdSymbolB-Book.tfm \
tex-FdSymbolB-Demi.tfm \
tex-FdSymbolB-Medium.tfm \
tex-FdSymbolC-Bold.tfm \
tex-FdSymbolC-Book.tfm \
tex-FdSymbolC-Demi.tfm \
tex-FdSymbolC-Medium.tfm \
tex-FdSymbolD-Bold.tfm \
tex-FdSymbolD-Book.tfm \
tex-FdSymbolD-Demi.tfm \
tex-FdSymbolD-Medium.tfm \
tex-FdSymbolE-Bold.tfm \
tex-FdSymbolE-Book.tfm \
tex-FdSymbolE-Demi.tfm \
tex-FdSymbolE-Medium.tfm \
tex-FdSymbolF-Bold.tfm \
tex-FdSymbolF-Book.tfm \
tex-FdSymbolF-Demi.tfm \
tex-FdSymbolF-Medium.tfm \
tex-fdsymbol-a.enc \
tex-fdsymbol-b.enc \
tex-fdsymbol-c.enc \
tex-fdsymbol-d.enc \
tex-fdsymbol-e.enc \
tex-fdsymbol-f.enc \
tex-fdsymbol.map \
tex-fdsymbol.sty \
texlive-fdsymbol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-fdsymbol-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
