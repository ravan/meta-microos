SUMMARY = "Libinput driver for the Xorg X server -- Development Files"
DESCRIPTION = "xf86-input-libinput is a libinput-based X.Org driver. The actual driver bit \
is quite limited, most of the work is done by libinput, the driver itself \
passes on the events (and wrangles them a bit where needed)."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "xf86-input-libinput-devel-1.5.0-1.9.aarch64.rpm"
RPM_HASH = "cf209c72b4df41e24386888ff5f191253b3bf30b4eec10c25a1464557c55c9cc6804f01581fa4c32167ac65fd55ba0cef397a0bbefcdf40d43349b3553209c68"

RPROVIDES:${PN} += "pkgconfig-xorg-libinput \
xf86-input-libinput-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xf86-input-libinput"

inherit rpm
