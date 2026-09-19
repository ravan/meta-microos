SUMMARY = "A LaTeX git wrapper"
DESCRIPTION = "This package provides several macros to fetch git information \
and typeset it. The macros defined by LaTeXgit can be helpful \
to documentation authors and others to whom clear document \
versioning is important."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn54811"

RPM_NAME = "texlive-latexgit-2026.226.svn54811-61.2.noarch.rpm"
RPM_HASH = "5572aec7a8970d4cadaa08c261ceed4e8972dd82ccaf837abcc7f2389bdcd464789a1fca0489eb39d55a94c0482c2a9e5ff2add559ee682707165977731bf3a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexgit.sty \
texlive-latexgit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
