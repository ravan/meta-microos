SUMMARY = "Text symbols in maths mode"
DESCRIPTION = "A package which provides access to some interesting characters \
of the Text Companion fonts (TS1 encoding) in maths mode."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1fsvn15878"

RPM_NAME = "texlive-mathcomp-2026.226.0.0.1fsvn15878-59.2.noarch.rpm"
RPM_HASH = "2bef4e52fa419b31f3628d260862511bc54a1f83f8fb88271fb5e1f61e18252464b21c278f825867956434d55058aa18c4a9ccb3c951ff6ab460c7003565e794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathcomp.sty \
texlive-mathcomp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
