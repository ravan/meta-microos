SUMMARY = "A suite of tools for typesetting algorithms in pseudo-code"
DESCRIPTION = "Consists of two environments: algorithm and algorithmic. The \
algorithm package defines a floating algorithm environment \
designed to work with the algorithmic style. Within an \
algorithmic environment a number of commands for typesetting \
popular algorithmic constructs are available."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.0.0.1svn78101"

RPM_NAME = "texlive-algorithms-2026.226.0.0.1svn78101-61.2.noarch.rpm"
RPM_HASH = "79a070dc75738d52f5ce2457aa024ee1baa5ea55c51b640a00726abd9781152d47e0e66a19fe3a2177c55c22583a3ddea51ceb3e73ccdbff9b37f92652b17a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algorithm.sty \
tex-algorithmic.sty \
texlive-algorithms"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
