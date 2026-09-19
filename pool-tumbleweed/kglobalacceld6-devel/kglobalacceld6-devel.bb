SUMMARY = "Global keyboard shortcut daemon: Build Environment"
DESCRIPTION = "Daemon providing Global Keyboard Shortcut (Accelerator) functionality. \
Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kglobalacceld6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "81ac82a155789ba3d926aa5c7f8b6276322413ae2aacd69a395853f8d4a6aaccb2ca1bb6ada8fececdc39a5dfaa4d533da9c5b117eb89e2e21dc3ea49791de6e"

RPROVIDES:${PN} += "cmake-KGlobalAccelD \
kglobalacceld6-devel"

RDEPENDS:${PN} += "cmake-Qt6DBus \
cmake-Qt6Widgets \
libKGlobalAccelD6-0"

inherit rpm
