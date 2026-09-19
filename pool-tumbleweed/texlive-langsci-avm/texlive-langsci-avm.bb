SUMMARY = "Feature structures and attribute-value matrices (AVM)"
DESCRIPTION = "A package for typesetting feature structures, also known as \
attribute-value matrices (AVMs), for use in linguistics. The \
package provides a minimal and easy to read syntax. It depends \
only on the array package and can be placed almost everywhere, \
in particular in footnotes or graphs and tree structures. The \
package serves the same purpose as, Christopher Manning's avm \
package, but shares no code base with that package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.0svn76924"

RPM_NAME = "texlive-langsci-avm-2026.226.0.0.4.0svn76924-63.2.noarch.rpm"
RPM_HASH = "64ff3a202d1caed46a29596fcc7440a36ba2d96b68cd8f5d5a5045efedc861c5d631b27d280e5ea2e207b3a22f4625bab61b770b5a9632745e9c1911f2f62efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-langsci-avm.sty \
texlive-langsci-avm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-etoolbox.sty \
tex-tikz.sty \
tex-unicode-math.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
