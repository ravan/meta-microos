SUMMARY = "Documentation for texlive-drs"
DESCRIPTION = "This package includes the documentation for texlive-drs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn19232"

RPM_NAME = "texlive-drs-doc-2026.226.1.1bsvn19232-59.2.noarch.rpm"
RPM_HASH = "63f0d066ac1f245b39280229fdec3e4da8b4ec649139307b2fbbef6d888f888add87b2a4f28cdc773edfe47b374116c29c9378ed393c114c9ae0f8d62230c166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drs-doc"

RDEPENDS:${PN} += ""

inherit rpm
