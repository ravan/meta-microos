SUMMARY = "Documentation for texlive-roundbox"
DESCRIPTION = "This package includes the documentation for texlive-roundbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn29675"

RPM_NAME = "texlive-roundbox-doc-2026.226.0.0.2svn29675-60.2.noarch.rpm"
RPM_HASH = "db078cc5adf49684a282cb432ea266759ff00ac160da4da396ff41d4498a9ec3a47439fc9577aa9bc945ec699619ffcfef4a2a0485ee446201a58a68b8e26d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roundbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
