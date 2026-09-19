SUMMARY = "Better vertical spacing in tables and arrays"
DESCRIPTION = "Modifies LaTeX's array and tabular environments to keep text \
from touching other text or hlines above or below. Several new \
parameters are defined and some standard macros are re-defined. \
The package slows down compilation of tables, since each entry \
is boxed twice."
LICENSE = "LPPL-1.0"

PV = "2026.227.3.5svn77682"

RPM_NAME = "texlive-tabls-2026.227.3.5svn77682-62.2.noarch.rpm"
RPM_HASH = "71e391004ad11774406f3706364b911bd3318e4228fb32a6671141afdd9b6b11ac3074980c55e2e641dd231d15b2aee801bf192c93199a8cc5c97bba82bb4fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabls.sty \
texlive-tabls"

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
