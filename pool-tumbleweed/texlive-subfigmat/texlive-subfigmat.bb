SUMMARY = "Automates layout when using the subfigure package"
DESCRIPTION = "Defines an array/matrix-type environment that is used with the \
subfigure package to automate the placement of subfigures (or \
tables or text). The subfigures are placed left-to-right, \
top-to-bottom."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn20308"

RPM_NAME = "texlive-subfigmat-2026.226.1.0svn20308-64.2.noarch.rpm"
RPM_HASH = "226f88910951c1af791214d81d1fc0e1fa30f76c501936acb14bc35141e067fad2ca90ea71b71cdb70aeeb98011f4a08d9dd700cc6b30d250bd00d3f0198dc55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subfigmat.sty \
texlive-subfigmat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-subfigure.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
