SUMMARY = "Documentation for texlive-xmuthesis"
DESCRIPTION = "This package includes the documentation for texlive-xmuthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.1svn56614"

RPM_NAME = "texlive-xmuthesis-doc-2026.226.0.0.4.1svn56614-59.4.noarch.rpm"
RPM_HASH = "7718c1ade3fb77a8894e401e10e555db0694a3b2adb0b5fb6665c8c90b2583b336455b06704c16462d75ed1f9752407bf62bebac6c2ca5f8f0e928adda31cc80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
