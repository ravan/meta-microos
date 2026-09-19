SUMMARY = "Development files for libtatsu"
DESCRIPTION = "The libtatsu-devel package contains libraries and header files for \
developing applications that use libtatsu."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5+3git.20250922"

RPM_NAME = "libtatsu-devel-1.0.5+3git.20250922-1.5.aarch64.rpm"
RPM_HASH = "08edb05187cf82be62b71cf4b81c77e3914118928c49e5bbbf39089a926907793ce99ef768e2e8a5607ab84833b2ab64eb71c4030860775f48b01b4d401aabd2"

RPROVIDES:${PN} += "libtatsu-devel \
pkgconfig-libtatsu-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtatsu0 \
pkgconfig-libplist-2.0"

inherit rpm
