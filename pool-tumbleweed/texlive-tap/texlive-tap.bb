SUMMARY = "TeX macros for typesetting complex tables"
DESCRIPTION = "The package offers a simple notation for pretty complex tables \
(to Michael J. Ferguson's credit). With PostScript, the package \
allows shaded/coloured tables, diagonal rules, etc. The package \
is supposed to work with both Plain and LaTeX. An AWK converter \
from ASCII semigraphic tables to TAP notation is included."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.0.0.77svn31731"

RPM_NAME = "texlive-tap-2026.227.0.0.77svn31731-62.2.noarch.rpm"
RPM_HASH = "dcaece4eb914a6d5a4d2865a5845dcbc4a5eb406d6a11050b82269ac59aaa308b1079ad76b2edb3eb9580f1260ff66ad9ef73d108bfffaf22d6c2b62b303af5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tap.tex \
texlive-tap"

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
