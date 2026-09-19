SUMMARY = "Library and utility for displaying and configuring Wayland outputs"
DESCRIPTION = "COSMIC RandR is both a library and command line utility for displaying and \
configuring Wayland outputs. Each display is represented as an 'output head', \
whereas all supported configurations for each display is represented as 'output modes'."
LICENSE = "MPL-2.0"

PV = "1.0.8"

RPM_NAME = "cosmic-randr-1.0.8-1.5.aarch64.rpm"
RPM_HASH = "6a9d1502ebb993f1e86b5ff9bc2fa1b7caf6059dfad1af5a2379622aa299f4edfd4ba61ac822ae7b7857bd28c0d608990522fb1d053bffa79045e2fbc911e2de"

RPROVIDES:${PN} += "cosmic-randr"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
