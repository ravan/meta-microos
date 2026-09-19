SUMMARY = "Documentation for texlive-fbithesis"
DESCRIPTION = "This package includes the documentation for texlive-fbithesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2msvn21340"

RPM_NAME = "texlive-fbithesis-doc-2026.226.1.2msvn21340-59.2.noarch.rpm"
RPM_HASH = "2ed29e56eed93b1d80d1f24e7a401c4d3d37c8db8a187c1e71d450ce8d4a7501dafa8cc08b44dcf797ea8d88dbb1b31f78c7b049ba7ef35a70a48f3665d5213b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
