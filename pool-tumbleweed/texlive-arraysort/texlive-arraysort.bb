SUMMARY = "Sort arrays (or portions of them)"
DESCRIPTION = "The package provides a mechanism for sorting arrays (or \
portions of them); the arrays should have been created using \
the arrayjobx package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn31576"

RPM_NAME = "texlive-arraysort-2026.226.1.0svn31576-60.2.noarch.rpm"
RPM_HASH = "fd25a6f6935f32d8be6a224a6952383636a9d9b7b5852298e510761a2914657816605ce91e8b9f6feb2e274038cdb40ed16a792363c5e4e949d37d9693f789ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arraysort.sty \
texlive-arraysort"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arrayjobx.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-lcg.sty \
tex-macroswap.sty \
tex-pdftexcmds.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
