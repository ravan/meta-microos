SUMMARY = "Development files for the X11 authorization protocol library"
DESCRIPTION = "libXau provides mechanisms for individual access to an X Window \
System display. It uses existing core protocol and library hooks for \
specifying authorization data in the connection setup block to \
restrict use of the display to only those clients that show that they \
know a server-specific key called a 'magic cookie'. \
 \
This package contains the development headers for the library found \
in libXau6."
LICENSE = "MIT"

PV = "1.0.12"

RPM_NAME = "libXau-devel-1.0.12-2.5.aarch64.rpm"
RPM_HASH = "9fdbf7bbcacf4e02081772ae50530d314d3d6cbd26948fb52058c9d8acef56b4c86c9ca2b1bcb906e5821e118a83aa61eb8ef08aa316b7f00bf1c10727a49056"

RPROVIDES:${PN} += "libXau-devel \
pkgconfig-xau \
xorg-x11-libXau-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXau6 \
pkgconfig-xproto"

inherit rpm
