SUMMARY = "Adds relative coordinates and improves the \\plot command"
DESCRIPTION = "Adds two user commands to standard PiCTeX. One command uses \
relative coordinates, thus eliminating the need to calculate \
the coordinate of every point manually as in standard PiCTeX. \
The other command modifies \\plot to use a rule instead of dots \
if the line segment is horizontal or vertical."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-pictex2-2026.226.svn15878-58.2.noarch.rpm"
RPM_HASH = "8313af9e68505f06f5e9aa68409aed8c115caaccefa21023c3352a52b1bd87e4b5c47295762a7ae4ff16c70ae520d830189105c12fc2cdfcc4484315e0217ce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pictex2.sty \
texlive-pictex2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pictex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
