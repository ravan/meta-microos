SUMMARY = "Avoid name clashes with e-TeX commands"
DESCRIPTION = "New primitive commands are introduced in e-TeX; sometimes the \
names collide with existing macros. This package solves the \
name clashes by adding a prefix to e-TeX's commands. For \
example, eTeX's \\unexpanded is provided as \\etex@unexpanded."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn78101"

RPM_NAME = "texlive-etexcmds-2026.226.1.7svn78101-59.2.noarch.rpm"
RPM_HASH = "4277433884539e6097e647f07b1b9b61f70d4a340a47a5308aa6a92ec268cdc961e958f9675e6292e56d023e6df76f27aa5c1a220d58575ece37f1710a4c6dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etexcmds.sty \
texlive-etexcmds"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-infwarerr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
