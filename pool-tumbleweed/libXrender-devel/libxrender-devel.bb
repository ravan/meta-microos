SUMMARY = "Development files for the X11 Render Extension library"
DESCRIPTION = "The Xrender library is designed as a lightweight library interface to \
the Render extension. \
 \
This package contains the development headers for the library found \
in libXrender1."
LICENSE = "MIT"

PV = "0.9.12"

RPM_NAME = "libXrender-devel-0.9.12-1.7.aarch64.rpm"
RPM_HASH = "ca84c3333d83de4e61a81983768219bd0b27dbf04dfe72b49d69734b2b986a07b5487fd6466f0c80f886f88597129044550ae67868371a9c453fd29d0a3b67a6"

RPROVIDES:${PN} += "libXrender-devel \
pkgconfig-xrender \
xorg-x11-libXrender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXrender1 \
pkgconfig-renderproto \
pkgconfig-x11 \
pkgconfig-xproto"

inherit rpm
