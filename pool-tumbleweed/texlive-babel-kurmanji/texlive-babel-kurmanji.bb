SUMMARY = "Babel support for Kurmanji"
DESCRIPTION = "The package provides the language definition file for support \
of Kurmanji in babel. Kurmanji belongs to the family of Kurdish \
languages. Some shortcuts are defined, as well as translations \
to Kurmanji of standard 'LaTeX names'. Note that the package is \
dealing with 'Northern' Kurdish, written using a Latin-based \
alphabet. The arabxetex package offers support for Kurdish \
written in Arabic script."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn30279"

RPM_NAME = "texlive-babel-kurmanji-2026.226.1.1svn30279-60.2.noarch.rpm"
RPM_HASH = "68a88d40bcb526f062b6ace01fde8395e31f2c7828e14ebf102ee1f94afaa86597141569ad554d7e67a5607daa19d3ec1da4cac97d6bb823ad25ca7bd39798c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kurmanji.ldf \
texlive-babel-kurmanji"

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
