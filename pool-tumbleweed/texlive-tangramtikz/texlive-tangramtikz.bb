SUMMARY = "Tangram puzzles, with TikZ"
DESCRIPTION = "This package provides some commands (with English and French \
keys) to work with tangram puzzles: \\begin{EnvTangramTikz} and \
\\PieceTangram to position a piece, \\TangramTikz to display a \
predefined Tangram."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2.2svn75123"

RPM_NAME = "texlive-tangramtikz-2026.227.0.0.2.2svn75123-62.2.noarch.rpm"
RPM_HASH = "6da21d19d6cf12f96e71e6c9adf6b5e11367a8c3b46790f6f9273c7c0348787b2ac3015df159b4be797a99aae4cb3d1b13d57c561a8e979989b493d6ecdff14d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TangramTikz.sty \
texlive-tangramtikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listofitems.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
