SUMMARY = "Customizable windows for screen viewing of TeX documents"
DESCRIPTION = "Inspired by the pdfscreen package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn68667"

RPM_NAME = "texlive-pdfwin-2026.226.svn68667-58.2.noarch.rpm"
RPM_HASH = "5500b4d1ab6d4a94d6a4d831d88acc05174c7bb48b4071466d3d454302afcf5af50ac65e93791c66d968fdcbed41849caa340db584e1e33b714f02addad911ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfwin.cfg \
tex-pdfwin.sty \
texlive-pdfwin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-color.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-truncate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
