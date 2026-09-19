SUMMARY = "Additions to the Penlight Lua libraries"
DESCRIPTION = "This package extends the penlight package by adding useful \
functions for interfacing with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74000"

RPM_NAME = "texlive-penlightplus-2026.226.svn74000-58.2.noarch.rpm"
RPM_HASH = "85e7128732b2a27dc4949cf1dddc02fddf69cec6dc0935f79dabcae9f58399a739631dc053c9da2071b90e29721120ae862311580f00d699bd90ce3b704e035b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-penlightplus.sty \
texlive-penlightplus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-luacode.sty \
tex-luakeys.sty \
tex-penlight.sty \
tex-tokcycle.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
