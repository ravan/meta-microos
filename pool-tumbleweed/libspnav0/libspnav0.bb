SUMMARY = "Library for accessing 3D connexion devices"
DESCRIPTION = "The libspnav library is provided as a replacement of the magellan library. \
It provides a cleaner, and more orthogonal interface. libspnav supports \
both the original X11 protocol for communicating with the driver, and the \
new alternative non-X protocol. Programs that choose to use the X11 \
protocol, are automatically compatible with either the free spacenavd \
driver or the official 3dxserv, as if they were using the magellan SDK. \
 \
Also, libspnav provides a magellan API wrapper on top of the new API. So, \
any applications that were using the magellan library, can switch to \
libspnav without any changes. And programmers that are familliar with the \
magellan API can continue using it with a free library without the \
restrictions of the official SDK."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libspnav0-1.2-1.5.aarch64.rpm"
RPM_HASH = "daad1a4d0ad08cb4f72f3625330d0a7d47b6ed22fb81ff098a126a771a028746cd51028a81463c13eac17dbfa636f4e12d0887e96137cce0065b0e3e7d5a073f"

RPROVIDES:${PN} += "libspnav.so.0 \
libspnav0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
