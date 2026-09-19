SUMMARY = "Vietnamese version of the LaTeX introduction"
DESCRIPTION = "Vietnamese version of A Short Introduction to LaTeX2e."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.00svn55643"

RPM_NAME = "texlive-lshort-vietnamese-2026.226.4.00svn55643-59.2.noarch.rpm"
RPM_HASH = "29487867edd7d8504b97bf3b04096ee2a3931e1f12a7cf71b7de5835d076b32b375eb6b837ba5d3985c9088f104775e1d7f4542465a273e41a3aee427b2b200e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-vietnamese"

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
