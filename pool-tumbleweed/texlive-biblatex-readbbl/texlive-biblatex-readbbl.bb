SUMMARY = "Read a .bbl file created by biber"
DESCRIPTION = "This small package modifies the biblatex macro which reads a \
.bbl file created by Biber. It is thus possible to include a \
.bbl file into the main document with the filecontents \
environment and send it to a publisher who does not need to run \
the Biber program. However, when the bibliography changes one \
has to create a new .bbl file."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn61549"

RPM_NAME = "texlive-biblatex-readbbl-2026.226.0.0.01svn61549-61.2.noarch.rpm"
RPM_HASH = "ded8a4d9e3b3b515960d50cddd93e6783348b7a1b2ef2971d5ea9dec6e43252dd6ff2e9351b5fbfaa4014a14a861371173807bc6128643b4c3e58cd30e0ea908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-readbbl.sty \
texlive-biblatex-readbbl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
