SUMMARY = "Documentation for texlive-plainpkg"
DESCRIPTION = "This package includes the documentation for texlive-plainpkg"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn27765"

RPM_NAME = "texlive-plainpkg-doc-2026.226.0.0.4asvn27765-58.2.noarch.rpm"
RPM_HASH = "23e401062b7d4d7521751511a2a3c7c541046249d5228d6d15593d7802ffd35a8a2c8bbe96c03b04d37a884db0d1c16430e63115730a3342a049198607129b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plainpkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
