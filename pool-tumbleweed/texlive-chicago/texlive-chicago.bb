SUMMARY = "A 'Chicago' bibliography style"
DESCRIPTION = "Chicago is a BibTeX style that follows the 'B' reference style \
of the 13th Edition of the Chicago manual of style; a LaTeX \
package (to LaTeX 2.09 conventions) is also provided. The style \
was derived from the newapa style."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-chicago-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "15f74bba2f4d4772fb2909eaa8a987f74f0989e3d6000be23e0f722d8aab0e4456f7fa08de646fc1f250d8932c1f338235389a3cf61c033c632651ec892666ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chicago.sty \
texlive-chicago"

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
