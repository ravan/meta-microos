SUMMARY = "Shorter (and longer) underlines and underbars"
DESCRIPTION = "Some engineers need underlined or twice underlined variables \
for which the usual \\underline is too long. This package \
provides a generic command for creating underlines of various \
sizes and types."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn32261"

RPM_NAME = "texlive-ushort-2026.226.2.2svn32261-60.2.noarch.rpm"
RPM_HASH = "781acb3c53ff7a8b92c844793887483f0d293f4d30e4ab14b7236fad803d3610a33800276dd3a9e7e248287f8957717aab33ea763727c525e8ea1d4f72d22695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ushort.sty \
texlive-ushort"

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
