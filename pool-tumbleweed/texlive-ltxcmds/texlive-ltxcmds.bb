SUMMARY = "Some LaTeX kernel commands for general use"
DESCRIPTION = "This package exports some utility macros from the LaTeX kernel \
into a separate namespace and also makes them available for \
other formats such as plain TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.26svn77682"

RPM_NAME = "texlive-ltxcmds-2026.226.1.26svn77682-59.2.noarch.rpm"
RPM_HASH = "874814844fa3bb010ab658a64c01019828745561d1ced2327eb35adebf7e0753325a6861cbca31640cbf1f640d6fd11a1624e9f63b9e242a840799b72f78a6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxcmds.sty \
texlive-ltxcmds"

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
