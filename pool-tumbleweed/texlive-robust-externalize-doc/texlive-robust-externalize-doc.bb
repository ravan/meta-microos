SUMMARY = "Documentation for texlive-robust-externalize"
DESCRIPTION = "This package includes the documentation for texlive-robust-externalize"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn76924"

RPM_NAME = "texlive-robust-externalize-doc-2026.226.3.0svn76924-60.4.noarch.rpm"
RPM_HASH = "5c122dd862f03ef2181f7426abd003c8c91e38c2e06c36bfafcf7f00d36b32c22f6fa88f25d0cbc63533ab476202f6db6780b9ce88e3a9de35af85d6852e9d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-robust-externalize-doc"

RDEPENDS:${PN} += ""

inherit rpm
