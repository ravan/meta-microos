SUMMARY = "Name tags for equations"
DESCRIPTION = "The \\eqname command provides a name tag for the current \
equation, in place of an equation number. The name tag will be \
picked up by a subsequent \\label command."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20678"

RPM_NAME = "texlive-eqname-2026.226.svn20678-61.4.noarch.rpm"
RPM_HASH = "94bd320c5243925e91cd9c6fa6896402540ff80774357ef48079026410f30dffa95f04d28c90a8da0f92202afb7f011214ff12f3451ed6ae0de5209b1bb0a5ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqname.sty \
texlive-eqname"

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
