SUMMARY = "Minipage spanning a complete page"
DESCRIPTION = "This package provides the environment fullminipage, which \
generates a minipage spanning a new, complete page with page \
style empty. The environment provides options to set margins \
around the minipage and configure the background."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1.1svn34545"

RPM_NAME = "texlive-fullminipage-2026.226.0.0.1.1svn34545-60.2.noarch.rpm"
RPM_HASH = "397af8efb63904cb0d51feefe19549689c25038c1a5f582ad8e8195afbca7db4feb80156625bbc0d2c1602b8e7b9d894b90b98899c1254cf724838438e13d288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fullminipage.sty \
texlive-fullminipage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
