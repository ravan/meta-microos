SUMMARY = "Development files for OpenH264 (dummy implementation)"
DESCRIPTION = "The noopenh264-devel package contains libraries and header files for \
developing applications that use OpenH264 through this dummy \
implementation."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later"

PV = "2.6.0~noopenh264"

RPM_NAME = "libopenh264-devel-2.6.0~noopenh264-1.5.aarch64.rpm"
RPM_HASH = "0836e5acfe7012429b43713860b1b5393ec9f0114430ec20ba58407d4053411e5358ebf1110a03f8a6baa6546be8f8f3322b166859a05d92f52205517a32610b"

RPROVIDES:${PN} += "libopenh264-devel \
noopenh264-devel \
pkgconfig-openh264"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenh264-8"

inherit rpm
