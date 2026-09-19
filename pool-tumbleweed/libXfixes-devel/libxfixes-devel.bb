SUMMARY = "Development files for the X11 Xfixes extension library"
DESCRIPTION = "The X Fixes extension provides applications with work-arounds for \
various limitations in the core protocol. \
 \
This package contains the development headers for the library found \
in libXfixes3."
LICENSE = "MIT"

PV = "6.0.2"

RPM_NAME = "libXfixes-devel-6.0.2-2.4.aarch64.rpm"
RPM_HASH = "8230464582573b8ac2a98650a18343f9f07960c3a0122ad9ad0dcce3c6a7696e6b5f938d48fc1e6b6ba79520fb6a0a66cd1b5e77ca2bb45c3aea9f871e71a7b5"

RPROVIDES:${PN} += "libXfixes-devel \
pkgconfig-xfixes \
xorg-x11-libXfixes-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXfixes3 \
pkgconfig-fixesproto \
pkgconfig-x11 \
pkgconfig-xextproto \
pkgconfig-xproto"

inherit rpm
