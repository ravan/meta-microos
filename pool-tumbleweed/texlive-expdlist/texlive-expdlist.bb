SUMMARY = "Expanded description environments"
DESCRIPTION = "The package provides additional features for the LaTeX \
description environment, including adjustable left margin. The \
package also allows the user to 'break' a list (for example, to \
interpose a comment) without affecting the structure of the \
list (this works for itemize and enumerate lists and numbered \
lists remain in sequence)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn76924"

RPM_NAME = "texlive-expdlist-2026.226.2.4svn76924-59.2.noarch.rpm"
RPM_HASH = "c2c27263f2b0834dca169917da3d742934cb526f8054cbf25088f97e5712e736ac52b9db217c5da0e05d6489575aac09e9599d2f9bc32ed5e9197ffeed52ebab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-expdlist.sty \
texlive-expdlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
