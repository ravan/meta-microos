SUMMARY = "Development files for the X Event Interception Extension library"
DESCRIPTION = "libXevie provides an X Window System client interface to the EvIE \
extension to the X protocol. The EvIE (Event Interception Extension) \
allows for clients to be able to intercept all events coming through \
the server and then decide what to do with them, including being able \
to modify or discard events. \
 \
This package contains the development headers for the library found \
in libXevie1."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "libXevie-devel-1.0.3-13.11.aarch64.rpm"
RPM_HASH = "052d5ae528952c159f37f3ba588886f9bdb30b034e09eac57f66016ded8b4872779459405ba9fb33a0008831864a31d0e4306df361104b83061868d0da357935"

RPROVIDES:${PN} += "libXevie-devel \
pkgconfig-xevie"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXevie1 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xproto"

inherit rpm
