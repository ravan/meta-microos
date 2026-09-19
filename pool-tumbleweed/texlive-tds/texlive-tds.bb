SUMMARY = "The TeX Directory Structure standard"
DESCRIPTION = "Defines a structure for placement of TeX-related files on an \
hierarchical file system, in a way that is well-defined, and is \
readily implementable."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn64477"

RPM_NAME = "texlive-tds-2026.227.1.1svn64477-62.2.noarch.rpm"
RPM_HASH = "1001f3b761b8b7b1d0a6dc9bed54e5766fc9ef4007902e9c666c093077b5888cffe68cefe15f94954c2eb56bd0389a9f92ef01e16f484e51c2989112aa2e1f28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tds"

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
