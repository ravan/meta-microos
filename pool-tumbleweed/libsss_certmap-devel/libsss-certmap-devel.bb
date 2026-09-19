SUMMARY = "Development files for the FreeIPA certmap library"
DESCRIPTION = "A utility library for FreeIPA to map certificates."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "libsss_certmap-devel-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "c325e775fa68e2e47bcb4f07a6542d2ce05f9d40aabbc2cd0ded400e5896b2768878edf5096ef2087e2fb96a0e1668f535450c481af36f78e6aef5244bbe83a9"

RPROVIDES:${PN} += "libsss-certmap-devel \
pkgconfig-sss-certmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss-certmap0"

inherit rpm
