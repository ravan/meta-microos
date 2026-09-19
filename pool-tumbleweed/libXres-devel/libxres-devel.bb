SUMMARY = "Development files for the X Resource extension library"
DESCRIPTION = "libXRes provides an X Window System client interface to the Resource \
extension to the X protocol. The Resource extension allows for X \
clients to see and monitor the X resource usage of various clients \
(pixmaps, et al). \
 \
This package contains the development headers for the library found \
in libXRes1."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "libXres-devel-1.2.3-1.5.aarch64.rpm"
RPM_HASH = "fa5d0d68dad54487f9bc295888563816dde1b6d75e6632ae4de14354f43f103f7400faee1b0a0b53c143647f7968a3d0540eead52dc9148e20104ff6f64f751b"

RPROVIDES:${PN} += "libXres-devel \
pkgconfig-xres"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXRes1 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xproto"

inherit rpm
