SUMMARY = "Documentation for texlive-luamml"
DESCRIPTION = "This package includes the documentation for texlive-luamml"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.0svn78219"

RPM_NAME = "texlive-luamml-doc-2026.226.0.0.8.0svn78219-59.2.noarch.rpm"
RPM_HASH = "d6c1611fd4185a227bce66d9ad7e6a8fcde9015b18a74fa4aca699b4e3c956c2fa1d87c092bec3aa62d7e2e102eaac1c52f41279cc34ac752aa9a461f668e757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamml-doc"

RDEPENDS:${PN} += ""

inherit rpm
