SUMMARY = "Using the chemformula package with babel-russian settings"
DESCRIPTION = "The chemformula package and babel-russian settings \
(russian.ldf) both define macros named '\\ch'. The package \
chemformula-ru undefines babel's macro to prevent an error when \
both packages are loaded together. Optionally it redefines the \
\\cosh macro to print the hyperbolic cosine in Russian notation \
and/or defines a new macro \\Ch for that purpose."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71883"

RPM_NAME = "texlive-chemformula-ru-2026.226.svn71883-60.2.noarch.rpm"
RPM_HASH = "16da2d33f5eebb4a8aec7630574859c0bc57bd75ae3e3868faf82d2b2aee6fb10e439af6daf78b0d975a7f25c937149b66047ba73b0f41f2af171280fa02eec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemformula-ru.sty \
texlive-chemformula-ru"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemformula.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
