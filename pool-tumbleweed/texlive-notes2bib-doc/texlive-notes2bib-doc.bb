SUMMARY = "Documentation for texlive-notes2bib"
DESCRIPTION = "This package includes the documentation for texlive-notes2bib"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0msvn77682"

RPM_NAME = "texlive-notes2bib-doc-2026.226.2.0msvn77682-61.2.noarch.rpm"
RPM_HASH = "ef8183c75d7217a564dd3e32bb3a5944244dcd318854bfc5e4b2324990a177a1649a53c9eae04db1c38fcdcd1baacc0002948e2613ba437b8139b4de90e57ffd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notes2bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
