SUMMARY = "Documentation for texlive-outline"
DESCRIPTION = "This package includes the documentation for texlive-outline"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18360"

RPM_NAME = "texlive-outline-doc-2026.226.svn18360-61.2.noarch.rpm"
RPM_HASH = "4327fb3ced8bdfe4fc613641a4cf3bbc9e5e0dc42ee5efa9521e909bc12243093fd0b90747df635966275c4e017a0b7faae4c3ec33ced9ed30516aa5994910b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outline-doc"

RDEPENDS:${PN} += ""

inherit rpm
