SUMMARY = "Print the date in Basque"
DESCRIPTION = "The package provides two LaTeX commands to print the current \
date in Basque according to the correct forms ruled by The \
Basque Language Academy (Euskaltzaindia). The commands \
automatically solve the complex declination issues of numbers \
in Basque."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn26477"

RPM_NAME = "texlive-basque-date-2026.226.1.05svn26477-60.2.noarch.rpm"
RPM_HASH = "898931cb0c44f087ad457235e91b928272420368c43a75b867e2570d5442f2852098813cbef2270658e3f673554f71873bb6ac36e29bda5f93d1c83a919790ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basque-date.sty \
texlive-basque-date"

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
