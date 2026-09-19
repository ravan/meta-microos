SUMMARY = "Service granting access to the configuration options of gaming mice"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the daemon managing access to the hardware. \
It enables any user that is a member of the group 'games' to configure \
supported mice via ratbagctl or Piper."
LICENSE = "MIT"

PV = "0.18"

RPM_NAME = "ratbagd-0.18-2.5.aarch64.rpm"
RPM_HASH = "0492a6255f03db9a771ad577beffac3869d86061d7ff05b355a0c7d896a8771f30940fa8a4516ecb3d14d5a10548e50ec8e3a5ab1b98fdc23c367993ecae7fd2"

RPROVIDES:${PN} += "ratbagd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-games \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libsystemd.so.0 \
libudev.so.1 \
libunistring.so.5"

inherit rpm
