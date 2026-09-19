SUMMARY = "Development files for libubootenv"
DESCRIPTION = "Library to read and modify U-Boot environment. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libubootenv."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.7"

RPM_NAME = "libubootenv-devel-0.3.7-1.3.aarch64.rpm"
RPM_HASH = "b1943200af53d7269ffd4b4697757c4c5b4f128dc6939dde1d6ded9744e499dce00f1a4510173a1178e24efe504c21d6226d662c56658123f1122cfd3dcb156e"

RPROVIDES:${PN} += "libubootenv-devel \
pkgconfig-libubootenv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libubootenv0"

inherit rpm
