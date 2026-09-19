SUMMARY = "Development files for libsratom"
DESCRIPTION = "Development files for libsratom."
LICENSE = "ISC"

PV = "0.6.22"

RPM_NAME = "sratom-devel-0.6.22-1.3.aarch64.rpm"
RPM_HASH = "b33b4f505168fed8c725d363f05d6ba60f389669a015a275e8134e61a6401c7ce085700ee32ba3cc65bba8a0bd8495d7ebdaa7c60af6dc1f747d836438c86260"

RPROVIDES:${PN} += "libsratom-0-devel \
pkgconfig-sratom-0 \
sratom-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsratom-0-0 \
pkgconfig-lv2 \
pkgconfig-serd-0 \
pkgconfig-sord-0"

inherit rpm
