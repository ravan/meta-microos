SUMMARY = "Print numbers in a 'friendly' format"
DESCRIPTION = "Provides a command to print a number with (potentially \
different) separators every three digits in the parts either \
side of the decimal point (the point itself is also \
configurable). The macro is fully expandable and not fragile \
(unless one of the separators is). There is also a command \
\\sepnumform, that may be used when defining \\the<counter> \
macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn20186"

RPM_NAME = "texlive-sepnum-2026.226.2.0svn20186-60.2.noarch.rpm"
RPM_HASH = "4e1a04ed2e04c550b229930133228cce3e1ed6a883092dfdca3d0bfe222c5b1d76ad0376b6d4b5b00814a56613c8c7d64385c6f452cf5251d3a8914f1b504ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sepnum.sty \
texlive-sepnum"

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
