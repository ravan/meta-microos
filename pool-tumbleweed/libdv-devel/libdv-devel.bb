SUMMARY = "The Quasar DV codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (a.k.a. FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv-devel-1.0.0-181.3.aarch64.rpm"
RPM_HASH = "b2c6cc4cae91998c47a5e19f966269f0100f8cd7c5814bc1a3e79b0c8f320431a01cabdf118e19bb951eb3df5f55c3a454a03fb1ce3efe66614d292708b11fb0"

RPROVIDES:${PN} += "libdv-devel \
pkgconfig-libdv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdv4"

inherit rpm
