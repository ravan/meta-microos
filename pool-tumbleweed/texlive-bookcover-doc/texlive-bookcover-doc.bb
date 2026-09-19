SUMMARY = "Documentation for texlive-bookcover"
DESCRIPTION = "This package includes the documentation for texlive-bookcover"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.9svn77334"

RPM_NAME = "texlive-bookcover-doc-2026.226.3.9svn77334-59.2.noarch.rpm"
RPM_HASH = "7788a87665f4dc9b5319d6ab13ff31d70d7b9095984c3f0b325575bdf0941759c990e25bd5c1fefd32400b9a93e80d173e50efd2beb6507707c8615226a9d053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookcover-doc"

RDEPENDS:${PN} += ""

inherit rpm
