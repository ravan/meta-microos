SUMMARY = "Documentation for texlive-iitem"
DESCRIPTION = "This package includes the documentation for texlive-iitem"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn29613"

RPM_NAME = "texlive-iitem-doc-2026.226.1.0svn29613-60.2.noarch.rpm"
RPM_HASH = "c2a761529e6f1e460e9d0351ac58421b1a650797cb65030c5df1f9d6ab34220219fb680d1334bc790348f91e28870eac27e67576fd98057c11df6e0b27b6d202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
