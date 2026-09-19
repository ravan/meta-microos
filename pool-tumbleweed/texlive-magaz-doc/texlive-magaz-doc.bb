SUMMARY = "Documentation for texlive-magaz"
DESCRIPTION = "This package includes the documentation for texlive-magaz"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-magaz-doc-2026.226.0.0.4svn77682-59.2.noarch.rpm"
RPM_HASH = "9030b77481f1d44227fd1dc087fb3b973c2547616495420639d35c83f26c10691222e8592f1554ac0e3e00adb5bf087fa6aab711868696e0f56fb4951789e6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-magaz-doc"

RDEPENDS:${PN} += ""

inherit rpm
