SUMMARY = "Development files for libfixposix"
DESCRIPTION = "Thin wrapper over POSIX syscalls. \
 \
This package contains the pkgconfig, header files and libraries needed to \
develop application that use libfixposix."
LICENSE = "BSL-1.0"

PV = "0.5.1"

RPM_NAME = "libfixposix-devel-0.5.1-1.11.aarch64.rpm"
RPM_HASH = "3d36895420865ff623a47c336795367c70f1bc184c80f3a33339d2cc2962b25a2e2288acde9f660a872ffecfe8214ace2029dcef2ef09a114a6b3763e9dab298"

RPROVIDES:${PN} += "libfixposix-devel \
pkgconfig-libfixposix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfixposix4"

inherit rpm
