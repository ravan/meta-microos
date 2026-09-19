SUMMARY = "Typeset exercises and solutions with automatic addition of points"
DESCRIPTION = "This package defines the environments exercise and solution. \
The layout of these environments can be customized. The -- \
optional -- points in the exercises can be added automatically. \
The package also permits to hide the solutions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn55188"

RPM_NAME = "texlive-exercises-2026.226.1.1svn55188-59.2.noarch.rpm"
RPM_HASH = "ec553060cad2eadc5b35d04c92020768273bd1a9e8fe537559d4c675dcef6240cd45f3fb2a011dd4297dea743ee08c0d920a471f215aa00a512c996e6530b7dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercises.sty \
texlive-exercises"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-marginnote.sty \
tex-verbatim.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
