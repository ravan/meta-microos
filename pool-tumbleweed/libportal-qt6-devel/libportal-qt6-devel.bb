SUMMARY = "Headers for libportal Qt6 integration library"
DESCRIPTION = "The libportal-qt6-devel package contains libraries, build data, and \
header files for developing applications that use libportal-qt6."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "libportal-qt6-devel-0.10.0-1.5.aarch64.rpm"
RPM_HASH = "72c4745b5e21200b286499bf01968bdc21efa7b635405a8c2ecc9059f55500dccf92d877bd233e5f8fd8df9da830be70acb6514f2594b14ed3e6cd9da20a9378"

RPROVIDES:${PN} += "libportal-qt6-devel \
pkgconfig-libportal-qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-qt6-1 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Widgets \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-libportal"

inherit rpm
