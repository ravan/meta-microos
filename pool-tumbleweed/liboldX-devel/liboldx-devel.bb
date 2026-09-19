SUMMARY = "Development files for the X version 10 compatibility library"
DESCRIPTION = "X version 10 backwards compatibility for prehistoric X applications. \
 \
This package contains the development headers for the library found \
in liboldX6."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "liboldX-devel-1.0.1-13.5.aarch64.rpm"
RPM_HASH = "06328315c47654fa509363dfdbbfef0dc85bb5a85b0fcf996682d90f055966924bc4e0557959755069ad7941af59c2fa91746d1452de83879157df6bc4e5d5d4"

RPROVIDES:${PN} += "liboldX-devel \
pkgconfig-oldx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboldX6 \
pkgconfig-x11"

inherit rpm
