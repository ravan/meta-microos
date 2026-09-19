SUMMARY = "Libmms development files"
DESCRIPTION = "Headers and libraries to program against libmms"
LICENSE = "LGPL-2.1+"

PV = "0.6.4"

RPM_NAME = "libmms-devel-0.6.4-6.9.aarch64.rpm"
RPM_HASH = "48697d5323ad67b3d190a484737e3fc9f10e8cb69ff407bbc1c07c661785fd2aa6d646d8e330b3d25235dd27f8e240b80357a98accb4c216eb525a10e91aad7a"

RPROVIDES:${PN} += "libmms-devel \
pkgconfig-libmms"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmms0"

inherit rpm
