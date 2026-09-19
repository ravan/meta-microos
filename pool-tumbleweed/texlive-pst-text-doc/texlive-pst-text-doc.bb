SUMMARY = "Documentation for texlive-pst-text"
DESCRIPTION = "This package includes the documentation for texlive-pst-text"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn77682"

RPM_NAME = "texlive-pst-text-doc-2026.226.1.02svn77682-60.4.noarch.rpm"
RPM_HASH = "33b8a76849107101ead4f721fdc0d9bb245f35736254961aab6497ece475cf7e201162944974ff48dfd280a73bfd7fc6dca3a41c2e8bc4f177a2d8d88ac95361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
