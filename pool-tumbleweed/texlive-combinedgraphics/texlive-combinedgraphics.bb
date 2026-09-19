SUMMARY = "Include graphic (EPS or PDF)/LaTeX combinations"
DESCRIPTION = "This package provides a macro (\\includecombinedgraphics) for \
the inclusion of combined EPS/LaTeX and PDF/LaTeX graphics (an \
export format of Gnuplot, Xfig, and maybe other programs). \
Instead of including the graphics with a simple \\input, the \
\\includecombinedgraphics macro has some comforts: changing the \
font and color of the text of the LaTeX part; rescaling the \
graphics without affecting the font of the LaTeX part; \
automatic inclusion of the vector graphics part, as far as \
LaTeX part does not do it (e.g., for files exported from \
Gnuplot before version 4.2); and rescaling and rotating of \
complete graphics (similar to \\includegraphics from the \
graphicx package)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.2svn27198"

RPM_NAME = "texlive-combinedgraphics-2026.226.0.0.2.2svn27198-60.2.noarch.rpm"
RPM_HASH = "711309d4a4957567bc7b754f979d6aee5a44e269b532fab7592ad7c0e8a2eac6bdb67a94abac6e67bd4c1b3eaeab19d68bdb9b7106ef9158f5685e94de5b69bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-combinedgraphics.sty \
texlive-combinedgraphics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.cfg \
tex-color.sty \
tex-graphicx.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
