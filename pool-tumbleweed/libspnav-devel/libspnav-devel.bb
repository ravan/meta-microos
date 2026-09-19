SUMMARY = "Include files for libspnav"
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

RPM_NAME = "libspnav-devel-1.2-1.5.aarch64.rpm"
RPM_HASH = "d3b806ea47c1d41c1c908105dd83a9c5d81ee93b4a3fab2b16df8aabf0a7f8b19909405f612a16195cf4561e2540b7be877d55e1ceb81a464d6f6ad3b00ea195"

RPROVIDES:${PN} += "libspnav-devel \
pkgconfig-spnav"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspnav0"

inherit rpm
