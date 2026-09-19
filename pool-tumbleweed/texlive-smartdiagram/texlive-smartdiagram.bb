SUMMARY = "Generate diagrams from lists"
DESCRIPTION = "The package will create 'smart' diagrams from lists of items, \
for simple documents and for presentations."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3bsvn42781"

RPM_NAME = "texlive-smartdiagram-2026.226.0.0.3bsvn42781-64.2.noarch.rpm"
RPM_HASH = "4ede69c41a272c773042f804de02af88ee6d22adb94de0787470511f71f3035aafbca2ab5583c8a961ac774f96e758ffb3f7e2d63a3acf0bda5971fb9f60f24f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-smartdiagram.sty \
tex-smartdiagramlibraryadditions.code.tex \
tex-smartdiagramlibrarycore.commands.code.tex \
tex-smartdiagramlibrarycore.definitions.code.tex \
tex-smartdiagramlibrarycore.styles.code.tex \
texlive-smartdiagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
