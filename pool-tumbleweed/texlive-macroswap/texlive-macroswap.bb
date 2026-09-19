SUMMARY = "Swap the definitions of two LaTeX macros"
DESCRIPTION = "The package provides simple utility methods to swap the meaning \
(token expansion) of two macros by name."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn31498"

RPM_NAME = "texlive-macroswap-2026.226.1.1svn31498-59.2.noarch.rpm"
RPM_HASH = "ec1f67a8ae6a682d6f56196cd1090806cf315673ce054ff77c0d00a9972d37e2ea4bc2e2285a37f3786f0e3bfbacc048edcb080c35c2e4d36513c85d0d122f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-macroswap.sty \
texlive-macroswap"

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
