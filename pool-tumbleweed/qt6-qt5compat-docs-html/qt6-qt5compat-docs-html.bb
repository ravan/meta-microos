SUMMARY = "Documentation for qt6-qt5compat in HTML format"
DESCRIPTION = "This package contains documentation for qt6-qt5compat in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-qt5compat-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f983842d331a6e6e3aa1dd5027536fbd5e140331db9f64d40b12af129111178aea98661be2f9ad5628b03732e4dcb0627c8876b53821ca84cce3610775131795"

RPROVIDES:${PN} += "qt6-qt5compat-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
