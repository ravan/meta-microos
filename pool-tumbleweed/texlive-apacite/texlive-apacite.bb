SUMMARY = "Citation style following the rules of the APA"
DESCRIPTION = "Apacite provides a BibTeX style and a LaTeX package which are \
designed to match the requirements of the American \
Psychological Association's style for citations. The package \
follows the 6th edition of the APA manual, and is designed to \
work with the apa6 class. A test document is provided. The \
package is compatible with chapterbib and (to some extent) with \
hyperref (for limits of compatibility, see the documentation). \
The package also includes a means of generating an author index \
for a document."
LICENSE = "LPPL-1.0"

PV = "2026.226.6.03svn77682"

RPM_NAME = "texlive-apacite-2026.226.6.03svn77682-61.2.noarch.rpm"
RPM_HASH = "cbd446f2bb00b6ab385a5bb410b4f09bd7e5304c5a7b15642b2f07630a4184c87748f644ffab222f4b4aba08ebdd84092ed141765ba40e720cadb21e14ca755e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apacdoc.sty \
tex-apacite.sty \
texlive-apacite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-index.sty \
tex-multicol.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
