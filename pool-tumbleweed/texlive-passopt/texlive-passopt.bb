SUMMARY = "Passing options to packages or classes"
DESCRIPTION = "This package allows to reset the global options of a loaded \
macro package or document class, or to change the position of \
the pre-passed options in the list to the right."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01csvn76924"

RPM_NAME = "texlive-passopt-2026.226.1.01csvn76924-58.2.noarch.rpm"
RPM_HASH = "2be9320984bdaf4e243e8637d3ae346816cf541212ce867520e3b02d3c99d0c47111ac68e05792a594fcb788e6e0680a373b6669fd2a412206caf43c9a481243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-passopt.sty \
texlive-passopt"

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
