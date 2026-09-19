SUMMARY = "Colourchange"
DESCRIPTION = "The package allows you to change the colour of the structural \
elements (inner theme and outer theme) of your beamer \
presentation during the presentation. There is a manual option \
but there is also the option to have your structure colour \
change from one colour to another as a function of how far \
through the presentation you are."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.22svn21741"

RPM_NAME = "texlive-colourchange-2026.226.1.22svn21741-60.2.noarch.rpm"
RPM_HASH = "015b1333f366dfb4210632e01d6a37b2c5440f70169c00e00a3accb74d3ebfb0b859c9f62aa43d62988dce2eb1889e20033c87d169a2f818a400660558c60e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colourchange.sty \
texlive-colourchange"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
