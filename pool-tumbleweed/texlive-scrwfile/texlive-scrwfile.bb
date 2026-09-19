SUMMARY = "Use LaTeX .aux file in place of \\newrite files"
DESCRIPTION = "The package provides a means of sending all LaTeX \\newrite, \
table of contents, and other miscellaneous output via the LaTeX \
.aux file. The mechanism subverts the mechanism of \\newrite, \
and means there will never be a 'No room for new \\write' \
message."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.99svn77682"

RPM_NAME = "texlive-scrwfile-2026.226.0.0.1.99svn77682-60.2.noarch.rpm"
RPM_HASH = "b5d8b0fb6f79082cc8ce270619ce3c896e23dcb0379fe24a5a9af68ba24f3aebbe2acb9a338b939a53fe1cc0a48368d0b63f330f921b68037d550f8af03890ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scrwfile.sty \
texlive-scrwfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-scrbase.sty \
tex-scrlfile.sty \
tex-tocbasic.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
