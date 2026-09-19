SUMMARY = "A todo that snaps to the closer side"
DESCRIPTION = "This package is an alternative to todonotes, from which it \
differs in the following ways: Depending on where you call \
\\snaptodo, the note is put in the left or the right margin, \
whichever is closer. The notes bump each other so they never \
overlap; the lines never overlap either. Aesthetic and \
customizable style."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70676"

RPM_NAME = "texlive-snaptodo-2026.226.svn70676-64.2.noarch.rpm"
RPM_HASH = "2003f4a10fc66ed5981dee08801a6db99baba9aef3382659784347fff0698bccbf2be8f865c586bc4a8bf35a03b97799d629965a84c02e3d882367dc2120340f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-snaptodo.sty \
texlive-snaptodo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikzpagenodes.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
