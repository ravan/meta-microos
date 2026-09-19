SUMMARY = "Documentation for qt6-datavis3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-datavis3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-datavis3d-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "69cecad5043676013218e8b7acad4419c089f977349c432246c5fcf7a6132e32f2d764243d92ad61d9b542e52fad9b2fe301e6de2d8fa523b56514b93c3be2c9"

RPROVIDES:${PN} += "qt6-datavis3d-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
