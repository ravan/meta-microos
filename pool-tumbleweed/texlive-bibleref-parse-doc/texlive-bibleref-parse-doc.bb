SUMMARY = "Documentation for texlive-bibleref-parse"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-parse"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn22054"

RPM_NAME = "texlive-bibleref-parse-doc-2026.226.1.1svn22054-61.2.noarch.rpm"
RPM_HASH = "f91f05495eb3b25cb24b92b37458a618d2fbda5f5e35a9c633efa1bbd607613c4020163ca2716cd66f490862ba1f95737fec16113a5003b5398fe1f20ad22114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-parse-doc"

RDEPENDS:${PN} += ""

inherit rpm
