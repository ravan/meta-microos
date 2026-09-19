SUMMARY = "Intelligent brackets"
DESCRIPTION = "This small package provides a new definition of brackets [ and \
] as active characters to get correct blank spaces in \
mathematical mode when using for open intervals. Instead of \
parenthesis: ]-\\infty, 0[ is equivalent to (-\\infty, 0)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn67736"

RPM_NAME = "texlive-ibrackets-2026.226.1.2svn67736-60.2.noarch.rpm"
RPM_HASH = "8f6f15379a0fff95fb11ca45ea29cee41d6f36d5844b4f776ddb00f42782bdadf84cdcfbe8f1246363632654352d6fc917d17bcaf2b17336ad5d38505910744f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ibrackets.sty \
texlive-ibrackets"

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
