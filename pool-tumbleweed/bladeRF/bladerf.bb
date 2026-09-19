SUMMARY = "SDR radio receiver"
DESCRIPTION = "The software for bladeRF USB 3.0 Superspeed Software Defined Radio."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2025.10"

RPM_NAME = "bladeRF-2025.10-22.3.aarch64.rpm"
RPM_HASH = "c8c891e9672949c008ce44232336dc15fde277b535af8afbc7286c76d4813b93a90115d5af555462b1174954c49eda9ada241d279b50ab2c92247b7806486f4b"

RPROVIDES:${PN} += "bladeRF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbladeRF.so.2 \
libc.so.6 \
libcurl.so.4 \
libm.so.6 \
libncursesw.so.6 \
libtecla-r.so.1 \
libtinfo.so.6"

inherit rpm
