SUMMARY = "Tutorial on writing .dtx and .ins files"
DESCRIPTION = "This tutorial is intended for advanced LaTeX2e users who want \
to learn how to create .ins and .dtx files for distributing \
their homebrewed classes and package files."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn69587"

RPM_NAME = "texlive-dtxtut-2026.226.2.4svn69587-59.2.noarch.rpm"
RPM_HASH = "3545cc86b2f77c820f6c5ff4dd7adbafee307641cb886619014d94a054e165403b37389cc0ac1e4a102aeb3a3c7f232c9755cea34fbe70f22d3e1117c4f796e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxtut"

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
