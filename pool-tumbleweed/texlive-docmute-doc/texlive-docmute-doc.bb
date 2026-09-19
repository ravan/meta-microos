SUMMARY = "Documentation for texlive-docmute"
DESCRIPTION = "This package includes the documentation for texlive-docmute"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn78101"

RPM_NAME = "texlive-docmute-doc-2026.226.1.4svn78101-59.2.noarch.rpm"
RPM_HASH = "8222564e44407f847a1965188341f2038bcb289eaa35e2e187e98ebae7c154c7c23e036cf6e9f28122afc80f4fcc649655c35c12bec1f95128504c02e01be44b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docmute-doc"

RDEPENDS:${PN} += ""

inherit rpm
