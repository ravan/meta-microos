SUMMARY = "Styles for various Physics Journals"
DESCRIPTION = "Includes styles for American Physical Society, American \
Institute of Physics, and Optical Society of America. The \
distribution consists of the RevTeX class itself, and several \
support packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2fsvn67271"

RPM_NAME = "texlive-revtex-2026.226.4.2fsvn67271-60.4.noarch.rpm"
RPM_HASH = "67acbe8854a6b25915f3449ec0db59a2062b18ff5cf2219e0679e64eb35248ff5046808c303cad460d1b67b263b9370e25bb794d340d891a4607ad50b8d0e48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aapm4-2.rtx \
tex-aip4-2.rtx \
tex-aps10pt4-2.rtx \
tex-aps11pt4-2.rtx \
tex-aps12pt4-2.rtx \
tex-aps4-2.rtx \
tex-apsrmp4-2.rtx \
tex-ltxdocext.sty \
tex-ltxfront.sty \
tex-ltxgrid.sty \
tex-ltxutil.sty \
tex-revsymb4-2.sty \
tex-revtex4-2.cls \
tex-sor4-2.rtx \
texlive-revtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fleqn.clo \
tex-hyperref.sty \
tex-lineno.sty \
tex-natbib.sty \
tex-shortvrb.sty \
tex-textcase.sty \
tex-url.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
