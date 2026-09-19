SUMMARY = "Automatic processing of feynmp graphics"
DESCRIPTION = "The package takes care of running Metapost on the output files \
produced by the feynmp package, so that the compiled pictures \
will be available in the next run of LaTeX. The package honours \
options that apply to feynmp."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-feynmp-auto-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "e917d3a2e781f35b5169eb72740008ef11ac66ff8c9b491d284b9a649dc4668c7db3ec4e26d459a2cc83a3e4d5718c52bede73f2ecb3dedb00002846b06134a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-feynmp-auto.sty \
texlive-feynmp-auto"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-feynmp.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
