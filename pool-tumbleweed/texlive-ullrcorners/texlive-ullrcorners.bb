SUMMARY = "Draw corners on the upper left and lower right sides of a word"
DESCRIPTION = "The package provides a command to surround a word or a sequence \
or words by small corners on the upper left and lower right \
sides. The typographical convention is inspired by Mastering \
Regular Expressions, by Jeffrey E. F. Friedl (O'Reilly Media, \
2006), where it is used to delimit regular expressions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75278"

RPM_NAME = "texlive-ullrcorners-2026.226.1.0svn75278-60.2.noarch.rpm"
RPM_HASH = "d08aa8f6631c76940409d62f9c5931dce2b10fd9edfcec1efd7e57dd9491ed9a31fb04d7157019ccb9e05b2ce3aec71283c54825e0c34bc01b6c3a6e23347123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ullrcorners.sty \
texlive-ullrcorners"

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
