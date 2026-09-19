SUMMARY = "An 'end of proof' sign"
DESCRIPTION = "This package provides an additional 'end of proof' sign. The \
command's name is \\wasserdicht."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55643"

RPM_NAME = "texlive-endofproofwd-2026.226.svn55643-61.4.noarch.rpm"
RPM_HASH = "9c04238600dd71e7bab77c4386ea34a9bbe821fdd4572d6637546b42ec95b0b781260d274d4b07c94feef999afc72a2de4c47923d7162c508d8b9e0ee97ecf65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endofproofwd.sty \
texlive-endofproofwd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-import.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
