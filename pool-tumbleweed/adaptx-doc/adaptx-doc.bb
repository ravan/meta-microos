SUMMARY = "Documentation for adaptx"
DESCRIPTION = "This package contains the documentation for AdaptX."
LICENSE = "BSD-3-Clause"

PV = "0.9.13"

RPM_NAME = "adaptx-doc-0.9.13-137.10.noarch.rpm"
RPM_HASH = "c200ad81db77d3045416b82bd90fb36a426b133aa749f6937b4d14948b17b1a3f4615b77580368ddc2937efd8726c296500a0c341adda51a276c2e9dff9e8a73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptx-doc"

RDEPENDS:${PN} += ""

inherit rpm
