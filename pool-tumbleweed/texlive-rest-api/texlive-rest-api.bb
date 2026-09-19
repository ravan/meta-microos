SUMMARY = "Describing a rest api"
DESCRIPTION = "This LaTeX package provides macros to describe rest apis for \
documentation purposes. The endpoints can hold the following \
information: method description path parameter request body and \
content type response body, content type and status code"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn57068"

RPM_NAME = "texlive-rest-api-2026.226.1.4svn57068-60.4.noarch.rpm"
RPM_HASH = "052f58009d7b156c3b37f5979391b5d16ed4580333f1fb1271c5301c10a2fec8eb3383b6219cc99381345b008fe668577b9d5d7d5edd023961d10611564688b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rest-api.sty \
texlive-rest-api"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-color.sty \
tex-colortbl.sty \
tex-fontenc.sty \
tex-listings.sty \
tex-mdframed.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-transparent.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
