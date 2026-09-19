SUMMARY = "Error markup for LaTeX documents"
DESCRIPTION = "This package provides a simple infrastructure for recording \
errata in LaTeX documents. This allows the user to maintain an \
updated version of the document (with all errors corrected) and \
to automatically generate an errata document highlighting the \
difference to the published version."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn42428"

RPM_NAME = "texlive-errata-2026.226.0.0.3svn42428-61.4.noarch.rpm"
RPM_HASH = "c59aee82e98e08411e25754b9acf7bd2cf0de6bdc811f944d45718f2640d0bfd212b8d7582cbd5f089f9e6948025e5319d19bddc0f8b30171a4824ff57b99fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-errata.sty \
texlive-errata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
