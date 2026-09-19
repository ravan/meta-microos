SUMMARY = "Typeset with a randomly variable monospace font"
DESCRIPTION = "The typewriter package uses the OpenType Computer Modern \
Unicode Typewriter font, together with a LuaTeX virtual font \
setup that introduces random variability in grey level and \
angle of each character. It was originally an answer to a \
question on stackexchange."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn73877"

RPM_NAME = "texlive-typewriter-2026.226.1.3svn73877-59.2.noarch.rpm"
RPM_HASH = "c52d8a726abf2236f697dc66b32e6f796a9798305a0e1c05285df635ae917122e65dea2ac659a3cb70e7b6b70a01ea9bf65ec48eb01796096e1c29cca0dcdb9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typewriter.sty \
texlive-typewriter"

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
