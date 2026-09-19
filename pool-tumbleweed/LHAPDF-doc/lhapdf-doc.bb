SUMMARY = "API documentation for LHAPDF, a library for PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. \
 \
This package provides the API documentation for LHAPDF in HTML format."
LICENSE = "GPL-3.0-only"

PV = "6.5.5"

RPM_NAME = "LHAPDF-doc-6.5.5-1.9.noarch.rpm"
RPM_HASH = "c5732a6f232f9e389c20358290a4594d3ed256199d6fe1cd973815c9bc5b35ed2295d9b0f9fb1109c14dec3cb43ea04d01280150095160b9ef1b2f625f68a9ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "LHAPDF-doc"

RDEPENDS:${PN} += ""

inherit rpm
