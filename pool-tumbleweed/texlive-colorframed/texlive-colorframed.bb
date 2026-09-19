SUMMARY = "Fix color problems with the package 'framed'"
DESCRIPTION = "This package fixes problems with colour loss that occurs in the \
environments of the framed package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9bsvn77682"

RPM_NAME = "texlive-colorframed-2026.226.0.0.9bsvn77682-60.2.noarch.rpm"
RPM_HASH = "27a6d3128b377cc20ae206a3b6161cbc06ba8337ffb100e68cd03608280701cfb04c2157f8554f956961a95e29f3fe4430cf5d093af27d03b862fea26fbd40b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorframed.sty \
texlive-colorframed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-framed.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
