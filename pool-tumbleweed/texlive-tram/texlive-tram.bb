SUMMARY = "Typeset tram boxes in LaTeX"
DESCRIPTION = "Tram boxes are highlighted with patterns of dots; the package \
defines an environment tram that typesets its content into a \
tram box. The pattern used may be selected in an optional \
argument to the environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn29803"

RPM_NAME = "texlive-tram-2026.226.0.0.2svn29803-59.2.noarch.rpm"
RPM_HASH = "8770381c4113872bbf27b988a5774837111d7f79081071f570ece505665f34c472716e61d99be96ede10d40ab59fa2011c59d8de41cd8fff6a908e56621ee16e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tram.sty \
texlive-tram"

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
