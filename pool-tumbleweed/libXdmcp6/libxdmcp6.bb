SUMMARY = "X Display Manager Control Protocol library"
DESCRIPTION = "The X Display Manager Control Protocol (XDMCP) provides a uniform \
mechanism for an autonomous display to request login service from a \
remote host. By autonomous, we mean the display consists of hardware \
and processes that are independent of any particular host where login \
service is desired. An X terminal (screen, keyboard, mouse, \
processor, network interface) is a prime example of an autonomous \
display."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "libXdmcp6-1.1.5-1.9.aarch64.rpm"
RPM_HASH = "04cd50f710bdac897f82f942bc9d351c0f32b1b537835c086d13537beb9b6a05ad87d777b84e7903350b2e8ceb252c8280abba321c1cd921480d98d8af3660a5"

RPROVIDES:${PN} += "libXdmcp.so.6 \
libXdmcp6 \
xorg-x11-libXdmcp"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
