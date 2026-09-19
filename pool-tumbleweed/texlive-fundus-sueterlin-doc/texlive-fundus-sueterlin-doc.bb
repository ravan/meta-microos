SUMMARY = "Documentation for texlive-fundus-sueterlin"
DESCRIPTION = "This package includes the documentation for texlive-fundus-sueterlin"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn26030"

RPM_NAME = "texlive-fundus-sueterlin-doc-2026.226.1.2svn26030-60.2.noarch.rpm"
RPM_HASH = "34d3f8c49f279041a24778b8328f5cf0d30bffa8cc72b81d8dfa34ee2ad8bbd97c49f56e37aad852d17024bf3ba0a8368fe6d37f0e7276755399060ed147216b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fundus-sueterlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
