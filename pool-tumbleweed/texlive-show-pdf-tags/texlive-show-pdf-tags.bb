SUMMARY = "Extract PDF tags from tagged PDF files"
DESCRIPTION = "This package provides a tool to make the structure of tagged \
PDF files visible. It parses a PDF file and extracts most \
tagging related information to turn it into either a visual \
tree structure or an XML document representing the tags. The \
package is released together with a collection of schemas which \
can be used to check that the resulting XML structure follows \
specified rules."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77604"

RPM_NAME = "texlive-show-pdf-tags-2026.226.1.5svn77604-60.2.noarch.rpm"
RPM_HASH = "e182a99d71538bc50df4154de3eecc2b926259010c5e395ae4eb77c4c62abcdf3c967c902e48ed0b139a7ee3ea2083c17b6bb6205441459bdd9002dd898582c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-show-pdf-tags"

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
texlive-scripts-bin \
texlive-show-pdf-tags-bin"

inherit rpm
