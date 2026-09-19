SUMMARY = "Control how text gets copied from a PDF file"
DESCRIPTION = "The repltext package exposes to LaTeX a relatively obscure PDF \
feature: replacement text. When replacement text is specified \
for a piece of text, it is the replacement text, not the \
typeset text that is copied and pasted."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-repltext-2026.226.1.1svn77682-60.4.noarch.rpm"
RPM_HASH = "50a4cad9613dc04a56c6fdadb25643a1075fe0331270951cd857d13ea584e4c9de2a8b0774b4098528f817c0de928c04638fc9327f1e47b04d4e72a08eb73648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-repltext.sty \
texlive-repltext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
