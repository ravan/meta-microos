SUMMARY = "Asymmetric over-/underbraces in maths"
DESCRIPTION = "The package provides a character key-driven interface to \
supplement new constructions of the traditional \\overbrace and \
\\underbrace pairs in an asymmetric or arbitrary way."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-abraces-2026.226.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "21a07aadafe73b334a2c7cac888690cbf94764c43a5dc45f6173a78f91812e46f17ba7f86fc53a9447d82fc8098555138bcbafd554a4de3a57f49e253cc5d238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abraces.sty \
texlive-abraces"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
