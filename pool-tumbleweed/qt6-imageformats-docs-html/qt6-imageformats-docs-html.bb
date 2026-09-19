SUMMARY = "Documentation for qt6-imageformats in HTML format"
DESCRIPTION = "This package contains documentation for qt6-imageformats in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-imageformats-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0adb605fa32d042e9f92690a5d58bc788349c97daf82f2ae2a2a6821f05454b24d6db8f7c786ba7f1a441bb9810209923e4398e16ec0a31750a774f2ffe37ed8"

RPROVIDES:${PN} += "qt6-imageformats-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
