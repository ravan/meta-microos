SUMMARY = "Macros for font diagnostics"
DESCRIPTION = "This package provides macros for measuring alphabet lengths \
(i.e. the length occupied by the characters 'abcd...xyz'), \
em-widths and ex-heights, which may help in making typesetting \
decisions. The package is compatible with pdfLaTeX, LuaLaTeX, \
and XeLaTeX, and will accept font family switches defined via \
the fontspec package. The plan is that future versions shall be \
able to provide even more diagnostic tools, and some \
LuaTeX-specific special commands, too. The package relies on \
the following other LaTeX packages: expl3, array, booktabs, and \
siunitx."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.7svn44238"

RPM_NAME = "texlive-typoaid-2026.226.0.0.4.7svn44238-59.2.noarch.rpm"
RPM_HASH = "4f4dc72634a51b20b2083a5b2c6de1fd534cd85b25567b754b4dae573add8c69918d3b19f5c147a14faf1d8021f3e339e0d15d85241b5bf6eb14e3547b72aa4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typoaid.sty \
texlive-typoaid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-expl3.sty \
tex-siunitx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
