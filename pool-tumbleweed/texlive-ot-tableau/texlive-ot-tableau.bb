SUMMARY = "Optimality Theory tableaux in LaTeX"
DESCRIPTION = "The package makes it easy to create beautiful \
optimality-theoretic tableaux. The LaTeX source is visually \
very similar to a formatted tableau, which makes working with \
the source code painless (well, less painful). A variety of \
stylistic variants are available to suit personal taste. The \
package requires xstring, amssymb, bbding, suffix, colortbl, \
rotating, hhline (optionally), arydshln, and tipa (optionally)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn67813"

RPM_NAME = "texlive-ot-tableau-2026.226.svn67813-61.2.noarch.rpm"
RPM_HASH = "f82b7764cc6c740a64c2f109927e4903460360c4b453a72731ff615568a6c5f5b109f9c7578e0dbab068c739763515c458ccdc537f9f0cfeeef4460985cd23e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot-tableau.sty \
texlive-ot-tableau"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-arydshln.sty \
tex-bbding.sty \
tex-colortbl.sty \
tex-hhline.sty \
tex-rotating.sty \
tex-suffix.sty \
tex-tipa.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
