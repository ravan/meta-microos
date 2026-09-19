SUMMARY = "Alternative versions of 'ragged'-type commands"
DESCRIPTION = "The package defines new commands \\Centering, \\RaggedLeft, and \
\\RaggedRight and new environments Center, FlushLeft, and \
FlushRight, which set ragged text and are easily configurable \
to allow hyphenation (the corresponding commands in LaTeX, all \
of whose names are lower-case, prevent hyphenation altogether)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn77682"

RPM_NAME = "texlive-ragged2e-2026.226.3.6svn77682-60.4.noarch.rpm"
RPM_HASH = "83caac83dc20944d2c95a8a62fda71777468981cbf16346137659e8096398bb14395cdce5823a5ed01842f89dd5f4e9cee7eb4bbe9689375562016f58dbd7d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ragged2e.sty \
texlive-ragged2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everysel.sty \
tex-footmisc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
