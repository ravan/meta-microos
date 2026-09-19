SUMMARY = "LaTeX-relevant log information for debugging"
DESCRIPTION = "The package logs LaTeX's progress through the file, making the \
LaTeX output more verbose. This helps to make LaTeX debugging \
easier, as it is simpler to find where exactly LaTeX failed. \
The package outputs the typesetting of section, subsection and \
subsubsection headers and (if amsmath is loaded) details of the \
align environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-dprogress-2026.226.0.0.1svn15878-59.2.noarch.rpm"
RPM_HASH = "645301afb4e95bafa6d16ca7d366d58a4ebf1b203e570185f6d70af986e6390c263424b63d232089850ceca436349ff03f50091decb89d45750b7d44539cb1bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dprogress.sty \
texlive-dprogress"

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
