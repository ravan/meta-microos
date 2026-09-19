SUMMARY = "Reviewing LaTeX documents made easy(er)"
DESCRIPTION = "This package provides a simple way to review LaTeX documents. \
It allows to highlight and/or hide changes to a document, and \
to add comments to the text. This will help you to keep track \
of the changes you make to a document, and to easily spot the \
changes made by others, while always having the option of \
compiling a clean version of the document. This package also \
offers a way to include comments in the text, which can be \
toggled on and off. This is useful for adding notes to the \
text, or for leaving comments to other authors."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-xreview-2026.226.1.0svn76924-59.4.noarch.rpm"
RPM_HASH = "29b5e6c4a03e7219e2fabd53ee300ef9c7d481d622e927bc51998175b0bfd185374dbf90ff02145974029ce390405a0894677d1fa3fbeb170e9eb4ccb2f2dd98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xreview.sty \
texlive-xreview"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-letltxmacro.sty \
tex-pifont.sty \
tex-soul.sty \
tex-todonotes.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
