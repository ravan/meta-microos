SUMMARY = "An introductory tutorial for Metafont"
DESCRIPTION = "An old introduction to the use of Metafont, that has stood the \
test of time. It focuses on using the program, rather than \
designing fonts, but does offer advice about understanding \
errors in other people's fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn29803"

RPM_NAME = "texlive-metafont-beginners-2026.226.svn29803-61.2.noarch.rpm"
RPM_HASH = "7a6a076b1f36befa265f7d0c83027a21537d3ecbd22a23e0b9b6c7c057427c95249db130e6c5e45211bb538d8c3cba1fd8b0126c668bc588dd919d6ae11b59d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metafont-beginners"

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
