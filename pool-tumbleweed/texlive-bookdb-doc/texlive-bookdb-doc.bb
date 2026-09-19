SUMMARY = "Documentation for texlive-bookdb"
DESCRIPTION = "This package includes the documentation for texlive-bookdb"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76790"

RPM_NAME = "texlive-bookdb-doc-2026.226.0.0.2svn76790-59.2.noarch.rpm"
RPM_HASH = "107cab2a6849c054fe4f6750d5f8c7ca37a172413df8d28b333d33773a45c7f6e46ca1ecf598d6b35131d9fa1cb8bc32f5d6381859aeb3b957b4f8896c272c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookdb-doc"

RDEPENDS:${PN} += ""

inherit rpm
