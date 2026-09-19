SUMMARY = "Introspection bindings for umockdev -- a hardware mocking tool"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the GObject Introspection bindings for the library \
umockdev."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19.7"

RPM_NAME = "typelib-1_0-UMockdev-1_0-0.19.7-1.4.aarch64.rpm"
RPM_HASH = "26a95d6e10f950378873aaf2974781ab8a06fa83c1384eaf99a53633a0642a29980dbe656065ec36b7c5668a25b68e190a3014fd33587195b847ad746d838c40"

RPROVIDES:${PN} += "typelib-1-0-UMockdev-1-0 \
typelib-UMockdev"

RDEPENDS:${PN} += "libumockdev.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
