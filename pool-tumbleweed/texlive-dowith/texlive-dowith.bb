SUMMARY = "Apply a command to a list of items"
DESCRIPTION = "The package provides macros for applying a command to all \
elements of a list without separators, such as \
'\\DoWithAllIn{<cmd>}{<list-macro>}', and also for extending and \
reducing macros storing such lists. Applications in mind \
belonged to LaTeX, but the package should work with other \
formats as well. Loop and list macros in other packages are \
discussed. A further package, domore, is also provided, which \
enhances the functionality of dowith."
LICENSE = "LPPL-1.0"

PV = "2026.226.r0.32svn38860"

RPM_NAME = "texlive-dowith-2026.226.r0.32svn38860-59.2.noarch.rpm"
RPM_HASH = "3fd9c4dc25651100aa245935349938ddd50d35e65bd51d46d4a610d88d2f46acb1e63f661d28816be72b2185127b0542c5093226d3288d0d7c99f523d56f36cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-domore.sty \
tex-dowith.sty \
texlive-dowith"

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
