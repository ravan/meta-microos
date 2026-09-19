SUMMARY = "Development files for the X11 keyboard file manipulation library"
DESCRIPTION = "libxkbfile is used by the X servers and utilities to parse the XKB \
configuration data files. \
 \
This package contains the development headers for the library found \
in libxkbfile1."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libxkbfile-devel-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "a665de0ffff19b7431748014546c293cb3c74549c034d543352064911dd1f1e4b99c39a923ae14c713c9f44a3ba6768732f1d0a2c2d92d1a40bef45ad28941a4"

RPROVIDES:${PN} += "libxkbfile-devel \
pkgconfig-xkbfile \
xorg-x11-libxkbfile-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbfile1 \
pkgconfig-kbproto \
pkgconfig-x11"

inherit rpm
