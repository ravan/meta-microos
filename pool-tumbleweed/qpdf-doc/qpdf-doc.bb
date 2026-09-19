SUMMARY = "Documentation files for qpdf"
DESCRIPTION = "This package contains the documentation for qpdf"
LICENSE = "Apache-2.0"

PV = "12.4.1"

RPM_NAME = "qpdf-doc-12.4.1-1.1.noarch.rpm"
RPM_HASH = "7c36f2eda2614e96de74f3043f6efd2a4a94b5c4a87cd402e7caa3ac8e3580b4d8b30841e86f975733090de0239f3dc7af8b0942e0a948d2cac821267977a8b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
