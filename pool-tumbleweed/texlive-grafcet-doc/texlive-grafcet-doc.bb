SUMMARY = "Documentation for texlive-grafcet"
DESCRIPTION = "This package includes the documentation for texlive-grafcet"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.5svn22509"

RPM_NAME = "texlive-grafcet-doc-2026.226.1.3.5svn22509-60.4.noarch.rpm"
RPM_HASH = "e2d67b94e6b4f795f3bd69192d3aeaf079666e299cc6569cb6af57028303f899a1365894c13b87a0335eb1f66c56d6978b9e66d35adb4063e2772939d7ef6a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-grafcet-doc-fr \
texlive-grafcet-doc"

RDEPENDS:${PN} += ""

inherit rpm
