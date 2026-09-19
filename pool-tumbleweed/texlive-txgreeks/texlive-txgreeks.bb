SUMMARY = "Shape selection for TX fonts Greek letters"
DESCRIPTION = "The package allows LaTeX users who use the TX fonts to select \
the shapes (italic or upright) for the Greek lowercase and \
uppercase letters. Once the shapes for lowercase and uppercase \
have been selected via a package option, the \\other prefix \
(e.g., \\otheralpha) allows using the alternate glyph (as in the \
fourier package). The txgreeks package does not constrain the \
text font that may be used in the document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21839"

RPM_NAME = "texlive-txgreeks-2026.226.1.0svn21839-59.2.noarch.rpm"
RPM_HASH = "d10d517dfdd66a06ab90a9d78d1a8135577236fdee5ad31d38ce8668bf809823b57439a0d105cba28a9add59ede6b305060a0ef24b783bcc2b894980a94a47b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-txgreeks.sty \
texlive-txgreeks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-txfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
