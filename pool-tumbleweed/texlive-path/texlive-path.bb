SUMMARY = "Typeset paths, making them breakable"
DESCRIPTION = "Defines a macro \\path|...|, similar to the LaTeX \\verb|...|, \
that sets the text in typewriter font and allows hyphen-less \
breaks at punctuation characters. The set of characters to be \
regarded as punctuation may be changed from the package's \
default."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.05svn77682"

RPM_NAME = "texlive-path-2026.226.3.05svn77682-58.2.noarch.rpm"
RPM_HASH = "a990bf8da8b8913cfc0ef30d4c1fe482c5345046291fefff7d48997f3bc110f86e329259fd2cc107c66f73de0f8f9c838be0e1f577222996e112e1654325c6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-path.sty \
texlive-path"

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
