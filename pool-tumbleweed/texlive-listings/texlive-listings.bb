SUMMARY = "Typeset source code listings using LaTeX"
DESCRIPTION = "The package enables the user to typeset programs (programming \
code) within LaTeX; the source code is read directly by TeX--no \
front-end processor is needed. Keywords, comments and strings \
can be typeset using different styles (default is bold for \
keywords, italic for comments and no special style for \
strings). Support for hyperref is provided. To use, \
\\usepackage{listings}, identify the language of the object to \
typeset, using a construct like: \\lstset{language=Python}, then \
use environment lstlisting for inline code. External files may \
be formatted using \\lstinputlisting to process a given file in \
the form appropriate for the current language. Short (in-line) \
listings are also available, using either \\lstinline|...| or \
|...| (after defining the | token with the \\lstMakeShortInline \
command)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11bsvn77682"

RPM_NAME = "texlive-listings-2026.226.1.11bsvn77682-61.2.noarch.rpm"
RPM_HASH = "971746d59bba24d2bf20f56fcd92c986429eb3fb519269e9ec91ad932fbd4922921d4199772c3aac6fa53a6cf1a41f2782bf68128a352c0c10a1e6bb899fb1fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listings.cfg \
tex-listings.sty \
tex-lstdoc.sty \
tex-lstlang1.sty \
tex-lstlang2.sty \
tex-lstlang3.sty \
tex-lstmisc.sty \
tex-lstpatch.sty \
texlive-listings"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithmic.sty \
tex-color.sty \
tex-fancyvrb.sty \
tex-hyperref.sty \
tex-keyval.sty \
tex-nameref.sty \
tex-textcomp.sty \
tex-upquote.sty \
tex-xurl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
