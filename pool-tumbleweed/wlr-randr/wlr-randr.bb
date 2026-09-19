SUMMARY = "Utility to manage outputs of a Wayland compositor"
DESCRIPTION = "wlr-randr is a command line utility to manage outputs of a Wayland compositor."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "wlr-randr-0.4.1-1.10.aarch64.rpm"
RPM_HASH = "6fbf1b2ae346035ef3bdc486d7648954061442c34c2d19c32210bb94a614d6d731d2510bc5e3b7a03dddcd1975a37021d4839ae0857482b886733cc2d3e0c8fe"

RPROVIDES:${PN} += "wlr-randr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm
