SUMMARY = "Support macros for other packages"
DESCRIPTION = "Miscellaneous macros used by others of the author's packages. \
Contents of the package: \\newgif and other globals; \\@ifnextcat \
and \\@ifXeTeX; \\(Re)storeMacro(s) to override redefinitions; \
\\afterfi and friends; commands from relsize, etc.; 'almost an \
environment' or redefinition of \\begin (\\begin* doesn't check \
if the argument environment is defined)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.996svn24287"

RPM_NAME = "texlive-gmutils-2026.226.0.0.996svn24287-60.4.noarch.rpm"
RPM_HASH = "757e2db654b84d8ad9188289665995ea93879ee5c68603a6e476eed2c5c408c4f09514e1d27e4e6fa65d4b2e707ccd9c4f17d316cfc71ca3254a9cba5e3e4391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmRCS.sty \
tex-gmampulex.sty \
tex-gmbase.sty \
tex-gmcommand.sty \
tex-gmenvir.sty \
tex-gmlogos.sty \
tex-gmmeta.sty \
tex-gmmw.sty \
tex-gmnotonlypream.sty \
tex-gmparts.sty \
tex-gmrelsize.sty \
tex-gmtypos.sty \
tex-gmurl.sty \
tex-gmutils.sty \
texlive-gmutils"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-expl3.sty \
tex-graphicx.sty \
tex-multicol.sty \
tex-polski.sty \
tex-xkeyval.sty \
tex-xltxtra.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
