SUMMARY = "Development files for WindowMaker"
DESCRIPTION = "This package contains the header files and libraries necessary for \
developing applications which use WindowMaker."
LICENSE = "GPL-2.0-or-later"

PV = "0.96.0"

RPM_NAME = "WindowMaker-devel-0.96.0-1.9.aarch64.rpm"
RPM_HASH = "b841a6afcf9d7e29e9a70643a5123f913eebfdd487f4a909160e9b5c5ee1f157aa6ae654968e79627b660ad53c8a79db5ac760e8cb9e79f2126aec9dda9b3bff"

RPROVIDES:${PN} += "WindowMaker-devel \
pkgconfig-WINGs \
pkgconfig-WUtil \
pkgconfig-wmlib \
pkgconfig-wrlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
WindowMaker \
pkgconfig-WUtil \
pkgconfig-wrlib \
pkgconfig-x11"

inherit rpm
