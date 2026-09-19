SUMMARY = "Documentation for qt6-charts in HTML format"
DESCRIPTION = "This package contains documentation for qt6-charts in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-charts-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "edabef35878c27e1e549a7760f6d98fc309cab3bf27e49f0259d7018db661e700d2c77e9e0a9cb90d9c373654710bfd398c3a90c8887541c88e8750713a1e23d"

RPROVIDES:${PN} += "qt6-charts-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
