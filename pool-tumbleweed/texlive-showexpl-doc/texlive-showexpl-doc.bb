SUMMARY = "Documentation for texlive-showexpl"
DESCRIPTION = "This package includes the documentation for texlive-showexpl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3ssvn77682"

RPM_NAME = "texlive-showexpl-doc-2026.226.0.0.3ssvn77682-60.2.noarch.rpm"
RPM_HASH = "3a3135b84818b160ac7f21e03d3b6fec67eaead08d4bb3c9aac2b3bb36367df4b5a51f79c2a9c73dd9d11db81c6695db4daf22fcf83b94819008a6e561f7716e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showexpl-doc"

RDEPENDS:${PN} += ""

inherit rpm
