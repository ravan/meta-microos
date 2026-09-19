SUMMARY = "A Participant Information Form (PIF) for a human research protocol at the University of Western Australia"
DESCRIPTION = "This package generates a Participant Information Form (PIF) for \
a human research protocol at the University of Western \
Australia. It requires the UWA logo in PDF format, which is \
available in SVG format at \
https://static-listing.weboffice.uwa.edu.au/visualid/core-rebra \
nd/img/uwacrest/, and uses the Calibri fonts by default. The \
class works with XeLaTeX and LuaLaTeX. It depends on the \
uwa-letterhead package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn78219"

RPM_NAME = "texlive-uwa-pif-2026.226.1.0.1svn78219-60.2.noarch.rpm"
RPM_HASH = "32c94a94b0c794b315dfe65e8d0333aea99bad00bd266d22e769d9c670e8e1abccb4ceb4bb26bf3c9cb661d08764c2f38bae01d9736d3a0c6aa0ea2237f52027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwa-pif.cls \
texlive-uwa-pif"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-article.cls \
tex-fontspec.sty \
tex-setspace.sty \
tex-titlesec.sty \
tex-uwa-letterhead.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
