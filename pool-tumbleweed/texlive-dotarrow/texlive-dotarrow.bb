SUMMARY = "Extendable dotted arrows"
DESCRIPTION = "The package can draw dotted arrows that are extendable, in the \
same was as \\xrightarrow."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01asvn15878"

RPM_NAME = "texlive-dotarrow-2026.226.0.0.01asvn15878-59.2.noarch.rpm"
RPM_HASH = "0b9e2ff1c06e654a5effdb170a61db28c5378f50e5d1e3da27ed15bc83ba66231bdb32f0833d094510ba7b4e44849cc262d6e6b649042f92869b6e28d6458aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DotArrow.sty \
texlive-dotarrow"

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
