SUMMARY = "Document Rubik cube configurations and rotation sequences"
DESCRIPTION = "The bundle provides four packages: rubikcube provides commands \
for typesetting Rubik cubes and their transformations, \
rubiktwocube provides commands for typesetting Rubik twocubes \
and their transformations, rubikrotation which can process a \
sequence of Rubik rotation moves, with the help of a Perl \
package executed via \\write18 (shell escape) commands, and \
rubikpatterns, a collection of well known patterns and their \
associated rotation sequences."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0svn46791"

RPM_NAME = "texlive-rubik-2026.226.5.0svn46791-60.2.noarch.rpm"
RPM_HASH = "796cea85052e2cabe39dd3de5387d37f5ac9d88bdad2d5ccbe872b2a390468d369debba4a9be9415bb8e501978186e187c31e77b2a2a001faabfa4b51fdf38e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rubikcube.sty \
tex-rubikpatterns.sty \
tex-rubikrotation.sty \
tex-rubiktwocube.sty \
texlive-rubik"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Carp \
perl-Fatal \
perl-warnings \
sed \
tex-fancyvrb.sty \
tex-forarray.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-shellesc.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-rubik-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
