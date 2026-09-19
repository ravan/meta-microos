SUMMARY = "Provides commands for producing a colophon"
DESCRIPTION = "Colophons are a once-common design device by which a book (or \
document) designer gave some information to his readers about \
the design and makeup of the text. It typically includes the \
publisher (if not included elsewhere in the document), font \
size, leading size, measure, and of course font face \
identification. Sometimes it includes information about the \
tools used, as well. This package provides some highly \
configurable macros, with sensible defaults, for producing \
colophons without having to muck around with a lot of manual \
code."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-colophon-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "b5fcbf2aa0e89b018a210bac36acbc761919f207763b11d7ac87a382b8fd0242c1930ca25163a45befe252755d187aa651dba6cd591a0f8f07bab7ddfac3d14b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colophon.sty \
texlive-colophon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
