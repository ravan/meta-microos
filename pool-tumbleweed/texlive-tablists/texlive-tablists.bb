SUMMARY = "Tabulated lists of short items"
DESCRIPTION = "This package offers environments and commands for one-level and \
two-level lists of short items (e.g., exercises in textbooks). \
The environments support optional arguments of item numbering \
similar to the enumerate or paralist packages."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.0esvn15878"

RPM_NAME = "texlive-tablists-2026.227.0.0.0esvn15878-62.2.noarch.rpm"
RPM_HASH = "0838e9c0a4a9e3850517ca91978a518415030ca660e7f84d924e9d5f48d2e14c5511009685c8408d2c78abce05f2e614d2f999c2907459b73ef66478e042b8c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tablists.sty \
texlive-tablists"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makecell.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
