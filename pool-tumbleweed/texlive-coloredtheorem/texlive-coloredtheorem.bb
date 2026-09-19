SUMMARY = "A colourful boxed theorem environment"
DESCRIPTION = "This packages provides a colourful boxed theorem environment, \
combining tcolorbox and breakable boxes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn74812"

RPM_NAME = "texlive-coloredtheorem-2026.226.1.1.2svn74812-60.2.noarch.rpm"
RPM_HASH = "551b739a95084a0cb8df86e7e5ac9e2dd510d30358bd1c2fe12036aac086d5b4cb4caf51fbe350721681e5020f9d2595117cb1e37e19991816526fd26476b13e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coloredtheorem.sty \
texlive-coloredtheorem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
