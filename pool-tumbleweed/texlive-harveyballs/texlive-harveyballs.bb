SUMMARY = "Create Harvey Balls using TikZ"
DESCRIPTION = "The package provides 5 commands (giving symbols that indicate \
values from 'none' to 'full')."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn32003"

RPM_NAME = "texlive-harveyballs-2026.226.1.1svn32003-60.4.noarch.rpm"
RPM_HASH = "e5808d258cd1c03818dfd41b3c1c5d37d6f61b5bae6c532f5d9e3accc56ed73683e321248855ecaef974061ec2aa763e67fae5a29b8a3dd165fe321704d64c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harveyballs.sty \
texlive-harveyballs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
