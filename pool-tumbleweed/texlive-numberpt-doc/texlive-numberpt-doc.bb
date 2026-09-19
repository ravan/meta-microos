SUMMARY = "Documentation for texlive-numberpt"
DESCRIPTION = "This package includes the documentation for texlive-numberpt"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-numberpt-doc-2026.226.1.0svn76924-61.2.noarch.rpm"
RPM_HASH = "d4ce98ea27ceffde45926ca46e6b5ee2897a621747eb64408bec38bac55d0d34fd705e971cdfd14d6442e1aa83e3fcdd8ed2ef8aafce507afa232a18ee54e52f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numberpt-doc"

RDEPENDS:${PN} += ""

inherit rpm
