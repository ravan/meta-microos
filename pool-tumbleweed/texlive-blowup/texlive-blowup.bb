SUMMARY = "Upscale or downscale all pages of a document"
DESCRIPTION = "The package blowup only defines the user-level macro \\blowUp, \
which can be used to upscale or downscale all pages of a \
document. It is similar to the TeX primitive \\magnification but \
more accurate and user-friendly."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.0svn77682"

RPM_NAME = "texlive-blowup-2026.226.2.2.0svn77682-59.2.noarch.rpm"
RPM_HASH = "51e3c068093c7c85df96578ff405167a20ddb1d89f0c8d7f9a191548cae9db6eb2be1d832f0ae4ed69f480ee9e2dd1cb5b3ee7ebe4c334e31626be0d86ff9df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blowup.sty \
texlive-blowup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
tex-iftex.sty \
tex-keyval.sty \
tex-typearea.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
