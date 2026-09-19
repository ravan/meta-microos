SUMMARY = "A TikZ command set for structural mechanics drawings"
DESCRIPTION = "This package provides a collection of TikZ commands that allow \
users to draw basic elements in material/structural mechanics. \
It is thus possible to draw member forces, nodal \
forces/displacements, various boundary conditions, internal \
force distributions, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn66724"

RPM_NAME = "texlive-structmech-2026.226.1.2svn66724-64.2.noarch.rpm"
RPM_HASH = "bd13ab2cff8e24153128af1d7e17f5f147ad834bcb4a3f1201b6e579d2ec151c33682be5632d8bc588ad4a818afcd79d70b70f2638d23864589faebedf9f5cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-structmech.sty \
texlive-structmech"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
