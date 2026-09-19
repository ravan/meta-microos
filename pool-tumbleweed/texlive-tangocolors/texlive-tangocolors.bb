SUMMARY = "Use colors from the Tango color palette"
DESCRIPTION = "The Tango color palette defines some color names and their RGB \
codes. This LaTeX macro package implements these color names, \
so one can easily access these colors by their names. The \
package relies on the xcolor package, so please refer to the \
documentation to that package to learn how to access the \
defined colors."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.3svn66733"

RPM_NAME = "texlive-tangocolors-2026.227.0.0.3svn66733-62.2.noarch.rpm"
RPM_HASH = "33635b87f2e533f96f1fbdc5e12e1a8c8d79de7eb591f78bd782c18e76522fe9c847b6670a1725b93127c2cbc6f8abdd676e5640f29a6bf232015dc355ff70b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tangocolors.sty \
texlive-tangocolors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
