SUMMARY = "Documentation for texlive-xindex"
DESCRIPTION = "This package includes the documentation for texlive-xindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn77844"

RPM_NAME = "texlive-xindex-doc-2026.226.1.04svn77844-59.4.noarch.rpm"
RPM_HASH = "486868143aad34317cc29504e03de86c5120d73d8b3bd4246f2b7a684a5c1780984e32a2041f5c3126e2658e9a8064441e2d653e6fc17dd67f86f829ecc23e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xindex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
