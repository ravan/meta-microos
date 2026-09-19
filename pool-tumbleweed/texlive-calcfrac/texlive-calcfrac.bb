SUMMARY = "Calculates the value of an expression containing fractions"
DESCRIPTION = "This package is an engine for calculating numerical expressions \
containing fractions. The numerical value of the expression is \
calculated with a non-expandable method and displayed in the \
form of an irreducible fraction or, where appropriate, an \
integer. This package is intended for educational purposes. The \
videos showing its writing from scratch are available on \
youtube from episode 24: https://youtu.be/6lF4P6B3msw. This is \
why it is delivered with only a minimalist documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn68684"

RPM_NAME = "texlive-calcfrac-2026.226.0.0.2svn68684-59.2.noarch.rpm"
RPM_HASH = "9f8d43a1045ad54357d2e495d1125c54a1dd4e3c765be455c6a0641e704dba672f2dba14a1ad243293aa04e21165245f93fd99d1ab715f4222421f75c4d4b301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calcfrac.sty \
tex-calcfrac.tex \
texlive-calcfrac"

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
