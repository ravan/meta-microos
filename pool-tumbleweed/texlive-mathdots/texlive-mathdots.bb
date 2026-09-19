SUMMARY = "Commands to produce dots in math that respect font size"
DESCRIPTION = "Redefines \\ddots and \\vdots, and defines \\iddots. The dots \
produced by \\iddots slant in the opposite direction to \\ddots. \
All the commands are designed to change size appropriately in \
scripts, as well as in response to LaTeX size changing \
commands. The commands may also be used in plain TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn77682"

RPM_NAME = "texlive-mathdots-2026.226.0.0.9svn77682-59.2.noarch.rpm"
RPM_HASH = "7c58b4eaa744bf39bd68faa62c52e4478ae950f9e07b63fecd53ed354ba48af3af874eff56ee0bc1c286e9e65ecbd242fee980c82811e01968d1e63e9074a7fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathdots.sty \
tex-mathdots.tex \
texlive-mathdots"

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
