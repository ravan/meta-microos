SUMMARY = "The letterhead of the University of Western Australia"
DESCRIPTION = "This package generates the letterhead of the University of \
Western Australia. It requires the UWA logo in PDF format, \
which is available in SVG format at \
https://static-listing.weboffice.uwa.edu.au/visualid/core-rebra \
nd/img/uwacrest/, and uses the Arial and UWA Slab fonts by \
default. The package works with XeLaTeX and LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn78219"

RPM_NAME = "texlive-uwa-letterhead-2026.226.1.0.1svn78219-60.2.noarch.rpm"
RPM_HASH = "2f035d445b593fb560f41505a37dcfc4e5786d7a038100f4fc6071b1e4dc0ff69ff45cc41185f2f34994f8bc517eaafaaf95d210408310f875ba7733bf380f47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwa-letterhead.sty \
texlive-uwa-letterhead"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-microtype.sty \
tex-sourcecodepro.sty \
tex-sourcesanspro.sty \
tex-stringstrings.sty \
tex-textpos.sty \
tex-titlesec.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
