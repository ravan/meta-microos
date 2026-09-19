SUMMARY = "Draw MSC diagrams"
DESCRIPTION = "The package should be useful to all people that prepare their \
texts with LaTeX and want to draw Message Sequence Charts in \
their texts. The package is not an MSC editor; it simply takes \
a textual description of an MSC and draws the corresponding \
MSC. The current version of the MSC macro package supports the \
full MSC2000 language."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn67718"

RPM_NAME = "texlive-msc-2026.226.2.00svn67718-61.2.noarch.rpm"
RPM_HASH = "d53d1d95ffef20f73470c68c0651a21a75ce72fc7a4ed79010a9e894092b1fdb7edab8b079159637354f50035ae63ceeaaf9102ef1134b25191e46cbde54cb1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-msc.sty \
texlive-msc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
