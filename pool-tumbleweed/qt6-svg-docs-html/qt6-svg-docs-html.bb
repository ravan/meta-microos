SUMMARY = "Documentation for qt6-svg in HTML format"
DESCRIPTION = "This package contains documentation for qt6-svg in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-svg-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "30061fb490eac076557ee021211763f58b71c98d227981a96039bf042f46a7a7bac267dd7a7baad5d64d992121a8daf99682db51b4c8d0c3521c66b132e44cde"

RPROVIDES:${PN} += "qt6-svg-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
