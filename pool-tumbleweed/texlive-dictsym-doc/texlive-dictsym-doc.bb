SUMMARY = "Documentation for texlive-dictsym"
DESCRIPTION = "This package includes the documentation for texlive-dictsym"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-dictsym-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "585b3489f5b3d5cdda020ed90564b460ff65dcd2b0166fc707cc0d6d7e41fd79b9dc756ca8bdd3df78b9e3d9d17c919abeb95fc1309ce422e4b12caafbe0190f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dictsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
