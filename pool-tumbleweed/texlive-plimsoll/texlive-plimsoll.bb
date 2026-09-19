SUMMARY = "Fonts with the Plimsoll symbol and LaTeX support"
DESCRIPTION = "This package provides access to the Plimsoll symbol for use \
with LaTeX. The Plimsoll symbol is sometimes used in chemistry \
for denoting standard states and values. The LaTeX package \
provides access to this notation as well. The syntax for \
denoting the standard state is the same as suggested in the \
Comprehensive LaTeX Symbol List for emulating the Plimsoll \
mark."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1svn56605"

RPM_NAME = "texlive-plimsoll-2026.226.1svn56605-59.2.noarch.rpm"
RPM_HASH = "8d0bdee962a5a85c925bbb64d0da4db3abcfdb7de284b98746a8a677c604035c6e7be479b52512936f16edbd35d10856ccdbdf258d508b3922f038a7cef170ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plimsoll-sans.tfm \
tex-plimsoll.enc \
tex-plimsoll.map \
tex-plimsoll.sty \
tex-plimsoll.tfm \
texlive-plimsoll"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-plimsoll-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
