SUMMARY = "Extended \\fbox macro from standard LaTeX"
DESCRIPTION = "This package redefines \\fbox to allow an optional argument for \
different frames. It can be any combination of l)eft, r)ight, \
t)op, and b)ottom, for example: \\fbox[lt]{foo}. Using uppercase \
letters or a combination of lowercase and uppercase is also \
possible."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.07svn77682"

RPM_NAME = "texlive-fbox-2026.226.0.0.07svn77682-59.2.noarch.rpm"
RPM_HASH = "89f611037572d8878042342e9c6ae4f87d3d96c679a11d3660c386d24a8cabd23137af4cc6f013ac294c62ac93ef0f0a2093d5b60cf7e44eb99e6beeed923751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fbox.sty \
texlive-fbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
