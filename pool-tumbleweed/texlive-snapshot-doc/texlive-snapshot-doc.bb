SUMMARY = "Documentation for texlive-snapshot"
DESCRIPTION = "This package includes the documentation for texlive-snapshot"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.14svn77682"

RPM_NAME = "texlive-snapshot-doc-2026.226.2.14svn77682-64.2.noarch.rpm"
RPM_HASH = "c3059438c3f556c36dee10e24465ddd738b23d639ab1a73e1e708daad967a8048a55da5cc84540adc0c6d5192594d755bc77bce81819ef44ca667dcaaa1cd72b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-snapshot-doc"

RDEPENDS:${PN} += ""

inherit rpm
