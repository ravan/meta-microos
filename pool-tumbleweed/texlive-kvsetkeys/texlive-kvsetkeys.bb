SUMMARY = "Key value parser with default handler support"
DESCRIPTION = "This package provides \\kvsetkeys, a variant of package keyval's \
\\setkeys. It allows the user to specify a handler that deals \
with unknown options. Active commas and equal signs may be used \
(e.g. see babel's shorthands) and only one level of curly \
braces are removed from the values."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.19svn77682"

RPM_NAME = "texlive-kvsetkeys-2026.226.1.19svn77682-63.2.noarch.rpm"
RPM_HASH = "2ba7f59e2bdf40f94010c98ca94254beff2510876e14d767c33c36cc13587a8e424db3acfcfee09b41f2cc99a0effa33de13fe3cf13b8a97e6dac4899a6ff058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvsetkeys.sty \
texlive-kvsetkeys"

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
