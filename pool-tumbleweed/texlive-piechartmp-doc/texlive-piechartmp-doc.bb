SUMMARY = "Documentation for texlive-piechartmp"
DESCRIPTION = "This package includes the documentation for texlive-piechartmp"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn19440"

RPM_NAME = "texlive-piechartmp-doc-2026.226.0.0.3.0svn19440-58.2.noarch.rpm"
RPM_HASH = "028c0fb2afeaa36074954907f0dc7348aaf5908a0846072338b6100cb56eb5619b960cbcfea5831da8c0c99cc4650e73e35d7472c036c2beb1233b47f410bc62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piechartmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
