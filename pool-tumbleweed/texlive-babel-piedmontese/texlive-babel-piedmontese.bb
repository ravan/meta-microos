SUMMARY = "Babel support for Piedmontese"
DESCRIPTION = "The package provides the language definition file for support \
of Piedmontese in babel. Some shortcuts are defined, as well as \
translations to Piedmontese of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn30282"

RPM_NAME = "texlive-babel-piedmontese-2026.226.1.0svn30282-60.2.noarch.rpm"
RPM_HASH = "b65449eb5c8e069493f39abf70d399a0a31c5ee44df1354d624ffee3e384c7f81d3e19d873a725b6adc0493d6225d122f8b99d42d4d50721546a2a21514af422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-piedmontese.ldf \
texlive-babel-piedmontese"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
