SUMMARY = "A Participant Consent Form (PCF) for a human research protocol at the University of Western Australia"
DESCRIPTION = "This LaTeX class generates a Participant Consent Form (PCF) for \
a human research protocol at the University of Western \
Australia. It requires the UWA logo in PDF format, which is \
available in SVG format at \
https://static-listing.weboffice.uwa.edu.au/visualid/core-rebra \
nd/img/uwacrest/, and uses the Arial and UWA Slab fonts by \
default. The class works with XeLaTeX and LuaLaTeX. It depends \
on the uwa-letterhead package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn78219"

RPM_NAME = "texlive-uwa-pcf-2026.226.1.0.1svn78219-60.2.noarch.rpm"
RPM_HASH = "0a4384b05d371fdbb8529182ebc47a6a0436518f461cc387d46b16f98854fd3509bc6cda5eedee0c23deca18d0ff4aa159cbbaf712a113636fff59fe1d15a7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwa-pcf.cls \
texlive-uwa-pcf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-article.cls \
tex-fontspec.sty \
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
