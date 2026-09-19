SUMMARY = "Delimiter commands that are easy to use and resize"
DESCRIPTION = "This package provides commands to give a consistent, \
easy-to-remember, easy to edit way to control the size and \
blackness of delimiters: append 1-4 'b's to command for larger \
sizes; prepend 'B' for boldface. These commands reduce the \
likelihood of incomplete delimiter pairs and typically use \
fewer characters than the LaTeX default."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77161"

RPM_NAME = "texlive-delimseasy-2026.226.2.0svn77161-59.2.noarch.rpm"
RPM_HASH = "1143847db2ec2d929be983c4a9701024962c38bb704f971a424cf1c32058c6b5fe24f85bdf9d20876f05b7cd9886351e0d8b8475d59282a33f6818a3c6555626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delimseasy.sty \
texlive-delimseasy"

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
