SUMMARY = "Documentation for qt6-positioning in HTML format"
DESCRIPTION = "This package contains documentation for qt6-positioning in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-positioning-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3da1f99c3aeea4f73858d898111f10b1c0c6d194ae2ed707b6926a6844d3c7c5c8c5e34266a3677caac005c7417c19cfd2050dc039bc31a5354a991368f92899"

RPROVIDES:${PN} += "qt6-location-docs-html \
qt6-positioning-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
