SUMMARY = "A flexible and easy interface to paper (stock) dimensions"
DESCRIPTION = "The package geometry is excellent for customizing the page \
layout. However, using the \\newgeometry command to change the \
page size in the middle of the document only affects the typing \
area and does not affect the real paper (stock) size. This \
package circumvents this situation by resizing the paper \
(stock) size to the new page layout."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.1svn77230"

RPM_NAME = "texlive-stocksize-2026.226.2.0.1svn77230-64.2.noarch.rpm"
RPM_HASH = "380ef9ea5bb6b9569a738ffef20ecfd83f4dd0735040d881cf008b7a4d58703b673c9372f95c2745eef4585d887743034e9553137f1b465e86771a51d7115f73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stocksize.sty \
texlive-stocksize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
