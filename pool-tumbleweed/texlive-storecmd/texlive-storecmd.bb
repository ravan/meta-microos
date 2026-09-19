SUMMARY = "Store the name of a defined command in a container"
DESCRIPTION = "The package provides macros for command definition that save \
the name of the command being defined in a file or a macro \
container. The list could be useful for spelling exceptions in \
text editors that do not support TeX syntax."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.2svn24431"

RPM_NAME = "texlive-storecmd-2026.226.0.0.0.2svn24431-64.2.noarch.rpm"
RPM_HASH = "9c4f22016da863fd872abf4923073b21fcbdb059b8d5ce03673f339c56e7a3d8bd3cfd56885ae916303fca2d86e9f4056979ffe9ef879d3e0a6219638c8002e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-storecmd.sty \
texlive-storecmd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
tex-ltxtools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
