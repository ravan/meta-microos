SUMMARY = "Documentation for texlive-cquthesis"
DESCRIPTION = "This package includes the documentation for texlive-cquthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.50svn55643"

RPM_NAME = "texlive-cquthesis-doc-2026.226.1.50svn55643-61.2.noarch.rpm"
RPM_HASH = "45174bdbb9124cba8447f98c5a4138769684c543bf31026a2f98d4f9a2ad4f1ce41a79f9e117fd842cb24791c3d7c851a0d832b473e0c8a34fb2d80d1804b55e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cquthesis-doc-zh \
texlive-cquthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
