SUMMARY = "A macro to format section numbering intuitively"
DESCRIPTION = "This package provides a macro \\setsecnum to format section \
numbering intuitively. \\setsecnum{1.1.1} will set the section \
numbering format to arabic.arabic.arabic and the depth to 3. \
The package uses LaTeX3."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-secnum-2026.226.svn76924-60.2.noarch.rpm"
RPM_HASH = "9002bbf2d25a550bf1cc6409d8acb86d2f603f8f66d2454a1f90adbca1adee955a17c4a925a78d12719a615dee81d71515f56a638b430fae8626388b08bb1c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-secnum.sty \
texlive-secnum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
