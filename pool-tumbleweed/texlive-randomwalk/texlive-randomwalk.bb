SUMMARY = "Random walks using TikZ"
DESCRIPTION = "The randomwalk package provides a user command, \\RandomWalk, to \
draw random walks with a given number of steps. Lengths and \
angles of the steps can be customized in various ways. The \
package uses lcg for its 'random' numbers and PGF/TikZ for its \
graphical output."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn76924"

RPM_NAME = "texlive-randomwalk-2026.226.0.0.6svn76924-60.4.noarch.rpm"
RPM_HASH = "b0039a07d1f25876688d9200a3f5d5229416b5a7eefda381c9033d1c64f767a2c3d73c5130671c97f68c9f40052ecc718f3ba13a2255adad472058294179fd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randomwalk.sty \
texlive-randomwalk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pgfcore.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
