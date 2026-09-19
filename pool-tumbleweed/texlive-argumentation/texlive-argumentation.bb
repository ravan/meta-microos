SUMMARY = "Create abstract argumentation frameworks via TikZ"
DESCRIPTION = "This package provides commands for creating abstract \
argumentation frameworks via TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn75931"

RPM_NAME = "texlive-argumentation-2026.226.1.6svn75931-61.2.noarch.rpm"
RPM_HASH = "0a8b33586e8ca6ee66b47cc5a76ef2a2ec795b278bbdfbb5dcd40ecddad61bc9641889e248a00e047956cf44c8927c3551203d8db8aed0aa5979d68712d3bb6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-argumentation.sty \
texlive-argumentation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amsmath.sty \
tex-pgfopts.sty \
tex-refcount.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
