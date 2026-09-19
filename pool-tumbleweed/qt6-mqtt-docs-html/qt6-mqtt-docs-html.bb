SUMMARY = "Documentation for qt6-mqtt in HTML format"
DESCRIPTION = "This package contains documentation for qt6-mqtt in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-mqtt-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3ff595999998d0e6e0e9ca55eb1f106e5aec559498b6043aace93d47fb55294f312485bc23f5fa7f00f0d8e3804b58053914c01a89a3917d4cafa47bd0421b48"

RPROVIDES:${PN} += "qt6-mqtt-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
