SUMMARY = "Documentation for qt6-coap in QCH format"
DESCRIPTION = "This package contains documentation for qt6-coap in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-coap-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "304cac30a4f0bdb0c7852a9e15361df52ddfb59d3558a43fd034bde40b18ab1e8eeae878341ca1b8c3c53a43fe1bf5fc015be22c08cb2c38f6caf8cbf0675d68"

RPROVIDES:${PN} += "qt6-coap-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
