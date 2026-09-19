SUMMARY = "Externalization of graphics and memoization of compilation results in general"
DESCRIPTION = "Memoize is a package for externalization of graphics and \
memoization of compilation results in general, allowing the \
author to reuse the results of compilation-intensive code. \
Memoize (i) induces very little overhead, as all externalized \
graphics is produced in a single compilation. It features (ii) \
automatic recompilation upon the change of code or \
user-adjustable context, and (iii) automatic externalization of \
TikZ pictures and Forest trees, easily extensible to other \
commands and environments. Furthermore, Memoize (iv) supports \
cross-referencing, TikZ overlays and Beamer, (v) works with all \
major engines and formats, and (vi) is adaptable to any \
workflow."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.1svn73025"

RPM_NAME = "texlive-memoize-2026.226.1.4.1svn73025-59.2.noarch.rpm"
RPM_HASH = "bef69d252d342915f4b731e0f92e06b7c451d7c7117b9be6eec1c4380a52b8846560ea1462953c7fde00f020f28c527ed06e45157a6a2ecc94fa36496d54083b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-memoizable.code.tex \
tex-memoizable.sty \
tex-memoizable.tex \
tex-memoize-beamer.code.tex \
tex-memoize-biblatex.code.tex \
tex-memoize-extract-one.tex \
tex-memoize.sty \
tex-memoize.tex \
tex-nomemoize.sty \
tex-nomemoize.tex \
tex-t-memoizable.tex \
tex-t-memoize.tex \
tex-t-nomemoize.tex \
texlive-memoize"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Path \
perl-File--Spec \
perl-Getopt--Long \
perl-strict \
sed \
tex-advice-tikz.code.tex \
tex-advice.sty \
tex-etoolbox.sty \
tex-pdftexcmds.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-memoize-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
