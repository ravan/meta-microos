SUMMARY = "Development files for the baresip library"
DESCRIPTION = "The baresip-devel package includes header files and libraries necessary \
for developing programs which use the baresip C library."
LICENSE = "BSD-3-Clause"

PV = "4.11.0"

RPM_NAME = "baresip-devel-4.11.0-1.1.aarch64.rpm"
RPM_HASH = "df2f3122460f1586de6c0c6ec338335453bf81390e07568edcd74f2964af4fdb78b843bde99085983b070b9e251f76b2066f1db1b68a23b148bbdf563dca344a"

RPROVIDES:${PN} += "baresip-devel \
pkgconfig-libbaresip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbaresip28 \
pkgconfig"

inherit rpm
