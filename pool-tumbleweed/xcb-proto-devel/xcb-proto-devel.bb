SUMMARY = "The X11 Protocol: X Protocol C Bindings"
DESCRIPTION = "The XCB protocol headers for X11 development. xcb-proto provides the \
XML-XCB protocol descriptions that libxcb uses to generate the majority of \
its code and API."
LICENSE = "X11"

PV = "7.6_1.17.0"

RPM_NAME = "xcb-proto-devel-7.6_1.17.0-1.8.aarch64.rpm"
RPM_HASH = "dc45d5f8a9d8298fad4422d64ea85ac9f06e21eee34419e6d030e9a6e8d1397290c148320eabb1c594746806af514302a699e8119a252392d3e282df3bfce9ee"

RPROVIDES:${PN} += "pkgconfig-xcb-proto \
xcb-proto-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python3-xcb-proto-devel"

inherit rpm
