SUMMARY = "Plot the solar system for a specific date"
DESCRIPTION = "The package uses pstricks to produce diagrams of the visible \
planets, projected on the plane of the ecliptic. It is not \
possible to represent all the planets in their real \
proportions, so only Mercury, Venus, Earth and Mars have their \
orbits in correct proportions and their relative sizes are \
observed. Saturn and Jupiter are in the right direction, but \
not in the correct size."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.15svn69675"

RPM_NAME = "texlive-pst-solarsystem-2026.226.0.0.15svn69675-60.4.noarch.rpm"
RPM_HASH = "d05106f9f8133da3d0adebcc09f585e3d0121f004be737096a51cfb9781390941433a2e8afe6b81222516f0de35320c9f120e4073be1c7b93196c380c5cb17f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-solarsystem.sty \
tex-pst-solarsystem.tex \
texlive-pst-solarsystem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
