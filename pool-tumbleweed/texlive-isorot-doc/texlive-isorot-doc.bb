SUMMARY = "Documentation for texlive-isorot"
DESCRIPTION = "This package includes the documentation for texlive-isorot"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-isorot-doc-2026.226.svn15878-63.2.noarch.rpm"
RPM_HASH = "1911f2ed37f1cbb90ed88d6e9a98af03e25a90a25a7470b559599aeaa8c72ae1fe5130b685036f9cd5851754280a3e4617e54a86558fe1b68aaaeb5525a5bda4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isorot-doc"

RDEPENDS:${PN} += ""

inherit rpm
