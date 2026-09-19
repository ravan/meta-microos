SUMMARY = "Macros for localizing TeX register allocations"
DESCRIPTION = "This package approaches the problem of the shortage of \
registers, by providing a mechanism for local allocation. The \
package works with Plain TeX, LaTeX, and LaTeX 2.09."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn56496"

RPM_NAME = "texlive-localloc-2026.226.svn56496-61.2.noarch.rpm"
RPM_HASH = "64c10533af4368d5221a43684ae1a8b59681eff9588bfc54f514270d907b45c2e0573f2e3fb89df723e09ced0b111655702cb49b5f3f2d1406ce2f68470b01e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-localloc.sty \
texlive-localloc"

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
