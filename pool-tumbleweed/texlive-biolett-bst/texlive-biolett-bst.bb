SUMMARY = "A BibTeX style for the journal 'Biology Letters'"
DESCRIPTION = "This package provides a BibTeX style (.bst) file for the \
journal 'Biology Letters' published by the Royal Society. This \
style was produced independently and hence has no formal \
approval from the Royal Society."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-biolett-bst-2026.226.svn76790-59.2.noarch.rpm"
RPM_HASH = "872a2d113173fbbad2db023ea6f90396b800ae87476784efbb575c0bc09b68384f1eac06e633ab59b75553dba327a6b04ad3e3322a88edd6b853ac01a868e41d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biolett-bst"

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
