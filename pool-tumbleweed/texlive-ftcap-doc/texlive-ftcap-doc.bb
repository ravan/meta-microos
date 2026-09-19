SUMMARY = "Documentation for texlive-ftcap"
DESCRIPTION = "This package includes the documentation for texlive-ftcap"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.4svn17275"

RPM_NAME = "texlive-ftcap-doc-2026.226.1.4svn17275-60.2.noarch.rpm"
RPM_HASH = "cc6be62f0d0c829dd4a30aa8b04483af1c9c7cee9ecc0768b214d822d45cc34442a74ed1218bcbddb5d4aad3b5882f02dd9c52a627547f17cafa81c5ddd3601c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ftcap-doc"

RDEPENDS:${PN} += ""

inherit rpm
