SUMMARY = "'Build Your Own Twemojis' with TikZ"
DESCRIPTION = "This package provides the means to create your own emojis (the \
simple, round, and mostly yellow ones) from elements of \
existing emojis. The provided command creates a TikZ picture \
from the stated elements with multiple possibilities to modify \
the result in color and position."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn58917"

RPM_NAME = "texlive-byo-twemojis-2026.226.1.0svn58917-59.2.noarch.rpm"
RPM_HASH = "4e55f2c17bde7cdad888378ac1bf5b7a4d41239ffee769c5e82959150b08797da6500d02e5eba52dad73e655592feb1917408817c95e3731981cb370a61cc830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-byo-twemojis.sty \
texlive-byo-twemojis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
