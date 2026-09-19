SUMMARY = "Get command name reliably"
DESCRIPTION = "Extracts the letters of a command's name (e.g., foo for command \
\\foo), in a reliable way."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-cmdstring-2026.226.1.1svn15878-60.2.noarch.rpm"
RPM_HASH = "0efeaad81b736f7a353f978399dbcd434c367b80b4a036fe2c310e3a537018e2bdf4e636d15bdf5110745a239347da43db69d3f08c0e04d06d9fa0948048df2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmdstring.sty \
texlive-cmdstring"

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
