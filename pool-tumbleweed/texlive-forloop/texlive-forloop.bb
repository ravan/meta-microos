SUMMARY = "Iteration in LaTeX"
DESCRIPTION = "The package provides a command \\forloop for doing iteration in \
LaTeX macro programming."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-forloop-2026.226.3.0svn77682-60.2.noarch.rpm"
RPM_HASH = "c5fa8c10d471049dedea346e1f009dbb0956732aa4c7b1f6fa2cdab9819f3a94e1308a5ec840e1362e5eab59ff737ad03b517f2f99ecf23ede39ca7afcd5f95f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-forloop.sty \
texlive-forloop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
