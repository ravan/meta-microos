SUMMARY = "Documentation for qt6-3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-3d-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "17b8bdba292de3251f3a13de5ca0dd3a58acf185bb4897eb1565351597844cd11bf360814e97077070622cfc40e30621977ddb6320466f84c5c3ef4242fed78f"

RPROVIDES:${PN} += "qt6-3d-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
