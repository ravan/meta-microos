SUMMARY = "Converting between common metric and Imperial units"
DESCRIPTION = "This LaTeX package implements a \\SmartUnit macro for converting \
between (some) metric and Imperial units. The package requires \
pgfkeys and siunitx."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn39592"

RPM_NAME = "texlive-smartunits-2026.226.1.2svn39592-64.2.noarch.rpm"
RPM_HASH = "0b0e1f883bff8190cf9731d2eefa09e1e2962e0cf43beb030b595b2d393896861897e07996981f6c9ede29bb630bacb6852c073fb4cd4be2f7884a735c3a98a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-smartunits.sty \
texlive-smartunits"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-pgfmath.sty \
tex-siunitx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
