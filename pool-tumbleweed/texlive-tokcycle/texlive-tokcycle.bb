SUMMARY = "Build tools to process tokens from an input stream"
DESCRIPTION = "The tokcycle package helps one to build tools to process tokens \
from an input stream. If a macro to process an arbitrary single \
token can be built, then tokcycle can provide a wrapper for \
cycling through an input stream (including macros, spaces, and \
groups) on a token-by-token basis, using the provided macro on \
each successive character. tokcycle characterizes each \
successive token in the input stream as a Character, a Group, a \
Macro, or a Space. Each of these token categories are processed \
with a unique directive, to bring about the desired effect of \
the token cycle. If condition flags are provided to identify \
active, implicit, and catcode-6 tokens as they are digested. \
The package provides a number of options for handling groups."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn74841"

RPM_NAME = "texlive-tokcycle-2026.226.1.5svn74841-59.2.noarch.rpm"
RPM_HASH = "8b6ee67e665f22f044593849a995554557a24a485ff0725922d6d0c278f28fee977794249857cc7348ce1fd61c8b3fb89960ec0400bf7c13dd3c67b2f2890397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tokcycle.sty \
tex-tokcycle.tex \
texlive-tokcycle"

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
