SUMMARY = "Draw causal set (Hasse) diagrams"
DESCRIPTION = "This LaTeX package uses TikZ to generate (Hasse) diagrams for \
causal sets (causets) to be used inline with text or in \
mathematical expressions. The macros can also be used in the \
tikzpicture environment to annotate or modify a diagram, as \
shown with some examples in the documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn74247"

RPM_NAME = "texlive-causets-2026.226.1.5svn74247-59.2.noarch.rpm"
RPM_HASH = "8ddd8dd6cb3489999f1c705a7e4985dd31cdd7cfa13d8dcd6216c0df77abc9346a0b21b32848e34c80c037e9a0d9507000e74408cbf25b87e9a5df18c56f2e03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-causets.sty \
texlive-causets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
