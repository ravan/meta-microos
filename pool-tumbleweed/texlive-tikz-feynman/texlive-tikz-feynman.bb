SUMMARY = "Feynman diagrams with TikZ"
DESCRIPTION = "This is a LaTeX package allowing Feynman diagrams to be easily \
generated within LaTeX with minimal user instructions and \
without the need of external programs. It builds upon the TikZ \
package and leverages the graph placement algorithms from TikZ \
in order to automate the placement of many vertices. \
tikz-feynman allows fine-tuned placement of vertices so that \
even complex diagrams can still be generated with ease."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn56615"

RPM_NAME = "texlive-tikz-feynman-2026.226.1.1.0svn56615-59.2.noarch.rpm"
RPM_HASH = "0a69e646c6c5be5928cd53f14a0d9d8ea69a20734f6af1734f30cb0981063acc89ae9df599504b9af58c340a423304dc73547192551e2c92279654f9abdbe02f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-feynman.sty \
tex-tikzfeynman.keys.code.tex \
tex-tikzlibraryfeynman.code.tex \
texlive-tikz-feynman"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
