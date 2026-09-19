SUMMARY = "Auto-size graphics"
DESCRIPTION = "The FigSize package enables automatic sizing of graphics, \
especially when including graphics with the graphicx package. \
The user only has to specify the number of graphics that should \
fit to a page or fraction there of and the package will \
dynamically calculate the correct graphics sizes relative to \
the page size. Thus, graphics can be auto-sized to fill a whole \
page or fraction and manual changes of graphic sizes are never \
needed when changing document layouts. Finally, the package's \
dynamic lengths can be used to allow other document element \
sizes to be dynamic."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn18784"

RPM_NAME = "texlive-figsize-2026.226.0.0.1svn18784-59.2.noarch.rpm"
RPM_HASH = "8dadcd2bc0c494449ef88a8acd2945fd10b7bd8aae3740c8335f934d21fcd1336ba2e94e6ad64caa63a141dbaad59786afbdda0c1749d50372589564d1fa43f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figsize.sty \
texlive-figsize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-subfigure.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
