SUMMARY = "udev rules for tighter permissions of /dev/ntsync"
DESCRIPTION = "Automatically load the ntsync kernel module. \
 \
The module allows wine to handle the translations of some Windows specific \
primitives in a more efficient way. \
 \
This package provides udev rules to restrict /dev/ntsync to locally logged in users."
LICENSE = "MIT"

PV = "0.0.2"

RPM_NAME = "ntsync-autoload-udev-rules-0.0.2-1.4.noarch.rpm"
RPM_HASH = "44b3d8a7246070794ef9464c7291b450ed7e6a3a43bc234f5b16b8925e12bdf7e0c41f9964b8750a2cc2bf6a9e92569d88286d3626e5c0fba1539ca579d230ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ntsync-autoload-udev-rules"

RDEPENDS:${PN} += "ntsync-autoload"

inherit rpm
