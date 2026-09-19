SUMMARY = "Artificial Uncial font and LaTeX support macros"
DESCRIPTION = "The auncial-new bundle provides packages and fonts for a script \
based on the Artificial Uncial manuscript book-hand used \
between the 6th & 10th century AD. The script consists of \
minuscules and digits, with some appropriate period punctuation \
marks. Both normal and bold versions are provided, and the font \
is distributed in Adobe Type 1 format. This is an experimental \
new version of the auncial bundle, which is one of a series of \
bookhand fonts. The font follows the B1 encoding developed for \
bookhands. Access to the encoding is essential. The encoding \
mainly follows the standard T1 encoding."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn62977"

RPM_NAME = "texlive-auncial-new-2026.226.2.0svn62977-60.2.noarch.rpm"
RPM_HASH = "14e87d4f7d54ec38cf5d5f96a189ed7175af6816257272d22db938737a4018c5980b1d5448e50cce3ad17c0841fe8ad8fcff282fb83c270788d70b51e89b5a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-allauncl.sty \
tex-auncial.map \
tex-auncial.sty \
tex-auncl10.tfm \
tex-aunclb10.tfm \
tex-b1auncl.fd \
texlive-auncial-new"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-auncial-new-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
