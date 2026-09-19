SUMMARY = "Development files for zathura"
DESCRIPTION = "Development and header files for the zathura package."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-devel-2026.07.18-1.1.aarch64.rpm"
RPM_HASH = "8972bcdc8e4c3a126801ae2edf73949f01060181656207f5eee6c57cb3ea5ddb063d3276aa3640a139e5062009417e68e6e26bc93c0b4f05a4aaeb243c21c542"

RPROVIDES:${PN} += "pkgconfig-zathura \
zathura-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-cairo \
pkgconfig-girara \
zathura"

inherit rpm
