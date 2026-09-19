SUMMARY = "Selectively include/exclude portions of text"
DESCRIPTION = "Selectively include/exclude pieces of text, allowing the user \
to define new, separately controlled, comment versions. All \
text between \\comment ... \\endcomment or \\begin{comment} ... \
\\end{comment} is discarded. The opening and closing commands \
should appear on a line of their own. No starting spaces, \
nothing after it. This environment should work with arbitrary \
amounts of comment, and the comment can be arbitrary text. \
Other 'comment' environments are defined and \
selected/deselected with \\includecomment{versiona} and \
\\excludecomment{versionb} These environments are used as \
\\versiona ... \\endversiona or \\begin{versiona} ... \
\\end{versiona} with the opening and closing commands again on a \
line of their own."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.8svn77682"

RPM_NAME = "texlive-comment-2026.226.3.8svn77682-60.2.noarch.rpm"
RPM_HASH = "8ff4123ac749ea82eba906cd5ae9b433167d5e7a23f64db999c6423ac4d4a6642c683f953670669e87b4d850f9bdd9974e525bff3e374c785969c30246be50ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-comment.sty \
texlive-comment"

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
