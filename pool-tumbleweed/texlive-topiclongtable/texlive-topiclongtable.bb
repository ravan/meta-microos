SUMMARY = "Extend longtable with cells that merge hierarchically"
DESCRIPTION = "This LaTeX package extends longtable implementing cells that: \
merge with the one above if it has the same content, do not \
merge with the one above unless the ones on the left are \
merged, are well behaved with respect to longtable chunking on \
page breaks, and automatically draw the correct separation \
lines. The typical use case is a table spanning multiple pages \
that contains a list of hierarchically organized topics (hence \
the package name). The package depends on array, expl3, \
longtable, multirow, xparse, and zref-abspage."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn76924"

RPM_NAME = "texlive-topiclongtable-2026.226.1.3.2svn76924-59.2.noarch.rpm"
RPM_HASH = "6d9a22d13d859c3d8b511e6b1388ab248bbe9c03a5499def4f3cfca8c1f39d88270386ed51a03978e6e77cd1f938ad6150f4f70d125c9fd2d2d06d5a4f3bcf64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-topiclongtable.sty \
texlive-topiclongtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-expl3.sty \
tex-longtable.sty \
tex-multirow.sty \
tex-xparse.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
