SUMMARY = "Development files for seatd"
DESCRIPTION = "Development files for seatd."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "seatd-devel-0.9.3-1.3.aarch64.rpm"
RPM_HASH = "cc3815ab07ca5ba764c46a4a1525487c02bef1ab5ee376cfb4ae8f189b7c8106cb4fb5cb66c8b406dbd64f207871c191d8804c5c1e865fc9f66bf01ca0f3bfb7"

RPROVIDES:${PN} += "pkgconfig-libseat \
seatd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libseat1 \
pkgconfig-libsystemd"

inherit rpm
