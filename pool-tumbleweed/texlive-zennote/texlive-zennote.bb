SUMMARY = "Streamline your note-taking process!"
DESCRIPTION = "This package aims to provide you with an easy interface to \
speed up the process when organizing and producing elegant \
notes. All the tables, figures, equations, and listings are \
labelled according to the notenumber with the \\titlebox \
command. The noteframe environment helps you generate fancy \
colored boxes to emphasize the important information (e.g. \
Theorems, Equations, Proofs, etc.) in your document. You can \
customize the style and color to denote different categories, \
too."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn76924"

RPM_NAME = "texlive-zennote-2026.226.1.0.0svn76924-59.4.noarch.rpm"
RPM_HASH = "c78580d993e34ec1d351130a87ba29b8661785caf3ad8e787777dd9d03ce6e5f7b9c7f95e0400db0506c3421772c2d7c66237585489dabf641a6cd0b3911e35b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zennote.sty \
texlive-zennote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
