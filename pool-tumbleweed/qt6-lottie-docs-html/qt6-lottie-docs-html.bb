SUMMARY = "Documentation for qt6-lottie in HTML format"
DESCRIPTION = "This package contains documentation for qt6-lottie in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-lottie-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0f9c264c8abf13fa9dfb408126414f2647b8e90ddf2a9eaedbaca0e644dcf7f2f62e1d76868f2ab33d32900b35b9c3397a10fbd2eda60b7be8ca5446bc1515f9"

RPROVIDES:${PN} += "qt6-lottie-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
