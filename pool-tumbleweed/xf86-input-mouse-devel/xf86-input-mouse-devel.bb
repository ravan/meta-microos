SUMMARY = "Development files for the Mouse input driver"
DESCRIPTION = "Development files for the Mouse input driver for the Xorg X server."
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "xf86-input-mouse-devel-1.9.5-1.11.aarch64.rpm"
RPM_HASH = "c44ed9c03caf4db46e631f17a95d580e727cc8962cc0e5d26bce57a78f924003d1e53891f19676b2ac551037f6c45b24ef2f93325cbf778d452060c45d135cb9"

RPROVIDES:${PN} += "pkgconfig-xorg-mouse \
xf86-input-mouse-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xf86-input-mouse"

inherit rpm
