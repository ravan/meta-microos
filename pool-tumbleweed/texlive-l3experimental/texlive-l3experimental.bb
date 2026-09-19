SUMMARY = "Experimental LaTeX3 concepts"
DESCRIPTION = "The l3experimental packages are a collection of experimental \
implementations for aspects of the LaTeX3 kernel, dealing with \
higher-level ideas such as the Designer Interface. Some of them \
work as stand alone packages, providing new functionality, and \
can be used on top of LaTeX2e with no changes to the existing \
kernel. The present release includes: l3draw, a code-level \
interface for constructing drawings; xcoffins, which allows the \
alignment of boxes using a series of 'handle' positions, \
supplementing the simple TeX reference point; xgalley, which \
controls boxes receiving text for typesetting."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76637"

RPM_NAME = "texlive-l3experimental-2026.226.svn76637-63.2.noarch.rpm"
RPM_HASH = "8f43cdfcb9a289137dc60457ebcb96d4e4fada7c3bd2df83cc8ae6a8bafb4eb4763c60f92c72682f703f96ea3dc94dec2176176839988e88423dd7eda2741035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-l3draw.sty \
tex-l3galley.sty \
tex-xcoffins.sty \
tex-xgalley.sty \
texlive-l3experimental"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
