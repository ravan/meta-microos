SUMMARY = "Development files for the XDM Control Protocol library"
DESCRIPTION = "The X Display Manager Control Protocol (XDMCP) provides a uniform \
mechanism for an autonomous display to request login service from a \
remote host. By autonomous, we mean the display consists of hardware \
and processes that are independent of any particular host where login \
service is desired. An X terminal (screen, keyboard, mouse, \
processor, network interface) is a prime example of an autonomous \
display. \
 \
This package contains the development headers for the library found \
in libXdmcp6."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "libXdmcp-devel-1.1.5-1.9.aarch64.rpm"
RPM_HASH = "3ac5b3313e3400bfa3690b8bd0af2af1aa44276ddf2d87a4dfb48309addf8e32915d3391c0110f564b19afa3ec50a4febcbbb9bed0127cf6c5c28610492d766c"

RPROVIDES:${PN} += "libXdmcp-devel \
pkgconfig-xdmcp \
xorg-x11-libXdmcp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXdmcp6 \
pkgconfig-xproto"

inherit rpm
