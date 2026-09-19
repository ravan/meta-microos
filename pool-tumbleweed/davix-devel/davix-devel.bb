SUMMARY = "Headers and sources for developing software using davix"
DESCRIPTION = "This package provides the headers and sources needed for developing \
applications using davix."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.10"

RPM_NAME = "davix-devel-0.8.10-2.1.aarch64.rpm"
RPM_HASH = "9732f4a6b2cf97ebe1d35a68e0d62f94c3a09392cb17b8308582f97c0f3abcf2a76a9a998024965df63405f51c058be112f757971fd03de3c5baee1b1b19af79"

RPROVIDES:${PN} += "davix-devel \
pkgconfig-davix \
pkgconfig-davix-copy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdavix0"

inherit rpm
