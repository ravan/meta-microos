SUMMARY = "Show 'realistic' quotes in verbatim"
DESCRIPTION = "Typewriter-style fonts are best for program listings, but \
Computer Modern Typewriter prints ` and ' as bent opening and \
closing single quotes. Other fonts, and most programming \
languages, print ` as a grave accent and ' upright; ' is used \
both to open and to close quoted strings. The package switches \
the typewriter font to Computer Modern Typewriter in OT1 \
encoding, and modifies the behaviour of verbatim, verbatim*, \
\\verb, and \\verb* to print in the '` and ' way'. It does this \
regardless of other fonts or encodings in use, so long as the \
package is loaded after the other fonts were. The package does \
not affect \\tt, \\texttt, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-upquote-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "f597ab2b4401966c1f1fd40f61bfe5c8c8f604bbb8edff163a4f62110f9abc5829bf895b0f3726ca0bc2f34dbb71a93efb39bb3187abcf97d2475d204767e783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upquote.sty \
texlive-upquote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
