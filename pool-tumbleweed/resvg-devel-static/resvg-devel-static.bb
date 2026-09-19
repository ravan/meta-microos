SUMMARY = "SVG rendering library (C++/Qt API)"
DESCRIPTION = "An SVG rendering library (C++/Qt API). \
This package contains development files for resvg. \
 \
It contains static libraries for -static linking which is highly discouraged."
LICENSE = "Apache-2.0 | MIT"

PV = "0.48.1"

RPM_NAME = "resvg-devel-static-0.48.1-1.2.aarch64.rpm"
RPM_HASH = "a472cc1dc96580e26058c63eb92b4442e7cd327d3de95ef61db6b98f3fece9c102385701e796c491850dd44b571522e2fce9b4053904c3f8496f87a08ccbaf12"

RPROVIDES:${PN} += "resvg-devel-static"

RDEPENDS:${PN} += "resvg-devel"

inherit rpm
