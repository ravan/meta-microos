SUMMARY = "Back-references from footnotes"
DESCRIPTION = "The package provides the means of creating hyperlinks, from a \
footnote at the bottom of the page, back to the occurrence of \
the footnote in the main text."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-footnotebackref-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "9bd58894780497b70467e0f889065c8dd1299e0047645a817eb2d1f65378cdc915214f2f03b2114db81e83d35c1a892f5a9cca2cf89ad2804a62d2fe3b5040b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footnotebackref.sty \
texlive-footnotebackref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-letltxmacro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
