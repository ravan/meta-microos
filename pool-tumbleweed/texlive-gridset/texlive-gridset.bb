SUMMARY = "Grid, a.k.a. in-register, setting"
DESCRIPTION = "Grid setting -- also known as strict in-register setting -- is \
something, that should be done for a lot of documents but is \
not easy using LaTeX. The package helps to get the information \
needed for grid setting. It does not implement auto grid \
setting, but there is a command \\vskipnextgrid, that moves to \
the next grid position. This may be enough under some \
circumstances, but in other circumstances it may fail. Thus \
gridset is only one more step for grid setting, not a complete \
solution."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-gridset-2026.226.0.0.4svn77682-60.4.noarch.rpm"
RPM_HASH = "c27399db35d386dd74677c63416c486348fa898271fc9d1268ec7036b9fd06a0c7f74c7a4de98239494325f44a842cfefa93e4fd23db7d3d62a61dbc9e4cdee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gridset.sty \
texlive-gridset"

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
