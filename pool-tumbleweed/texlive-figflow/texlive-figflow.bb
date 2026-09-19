SUMMARY = "Flow text around a figure"
DESCRIPTION = "Provides a Plain TeX macro \\figflow that allows one to insert a \
figure into an area inset into a paragraph. Command arguments \
are width and height of the figure, and the figure (and its \
caption) itself. Usage details are to be found in the TeX file \
itself. The package does not work with LaTeX; packages such as \
wrapfig, floatflt and picins support the needs of LaTeX users \
in this area."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21462"

RPM_NAME = "texlive-figflow-2026.226.svn21462-59.2.noarch.rpm"
RPM_HASH = "58d732af8493793ef54ac3e3c37d44950d1b37bcb83bc7e89ddde11b980ae41ef89b3d06dec0e9ac06ba825efd04a4baf4a3acea0dbd59fba67f33ac511370a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figflow.tex \
texlive-figflow"

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
