SUMMARY = "Library for the Osmocom Community TDMoIP network"
DESCRIPTION = "Library for the Osmocom Community TDMoIP network."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "libosmo-octoi3-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "661c910ce0c5e093ae92852c531adbf3ef8b353af8c3b4ee4ac5d1604259e907883d2b5c48764fbc1d9cdf97b882044b9bea82d06f608fdeccc8ab03b5ea2905"

RPROVIDES:${PN} += "libosmo-octoi.so.3 \
libosmo-octoi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libosmovty.so.13 \
libtalloc.so.2"

inherit rpm
