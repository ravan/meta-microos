SUMMARY = "A collection of cute little animals and similar creatures"
DESCRIPTION = "A collection of LaTeX packages for drawing cute little animals \
and similar creatures using TikZ. Currently, the following \
TikZlings are included: anteater ape bat bear bee bug cat \
chicken coati dog elephant hippo koala marmot meerkat mole \
mouse owl panda penguin pig rhino sheep sloth snowman squirrel \
turkey wolf These little drawings can be customized in many \
ways."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5svn77682"

RPM_NAME = "texlive-tikzlings-2026.226.2.5svn77682-59.2.noarch.rpm"
RPM_HASH = "a262aeb8db295a6b338e55e1be11dc22d241e28fc2109c275a96d589a816f80b0d9f5ae93fa5bd462579f65aad2666192f045e74e8faab9d6e1d6fd70752f5ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarytikzlings.code.tex \
tex-tikzlings-addons.sty \
tex-tikzlings-anteaters.sty \
tex-tikzlings-apes.sty \
tex-tikzlings-bats.sty \
tex-tikzlings-bears.sty \
tex-tikzlings-bees.sty \
tex-tikzlings-bugs.sty \
tex-tikzlings-cats.sty \
tex-tikzlings-chickens.sty \
tex-tikzlings-coatis.sty \
tex-tikzlings-dogs.sty \
tex-tikzlings-elephants.sty \
tex-tikzlings-hippos.sty \
tex-tikzlings-koalas.sty \
tex-tikzlings-list.sty \
tex-tikzlings-marmots.sty \
tex-tikzlings-meerkats.sty \
tex-tikzlings-mice.sty \
tex-tikzlings-moles.sty \
tex-tikzlings-owls.sty \
tex-tikzlings-pandas.sty \
tex-tikzlings-penguins.sty \
tex-tikzlings-pigs.sty \
tex-tikzlings-rhinos.sty \
tex-tikzlings-sheep.sty \
tex-tikzlings-sloths.sty \
tex-tikzlings-snowmen.sty \
tex-tikzlings-squirrels.sty \
tex-tikzlings-turkeys.sty \
tex-tikzlings-wolves.sty \
tex-tikzlings.sty \
texlive-tikzlings"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-epstopdf-pkg \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-pgf-blur \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
