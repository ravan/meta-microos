SUMMARY = "Support for symmetric groups"
DESCRIPTION = "A package for symmetric groups, allowing you to input, output, \
and calculate with them."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-permute-2026.226.svn15878-58.2.noarch.rpm"
RPM_HASH = "5e490709d19497e3b50307df1df3a4298478d1696d71ef37375463a0bedd7da009b79187f9ee1102ffdf571145f3263aa5d896c006e637d8eb58f6686ac4c9b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-permute.sty \
texlive-permute"

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
