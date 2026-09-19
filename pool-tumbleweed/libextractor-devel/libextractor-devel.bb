SUMMARY = "Include Files and Libraries mandatory for Development with libextractor"
DESCRIPTION = "GNU Libextractor is a library for extracting meta data from various files types. \
 \
This package contains all necessary include files and libraries needed to \
develop applications that require these."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-devel-1.14-1.2.aarch64.rpm"
RPM_HASH = "5db98ee325d5c2e1f6f97c33ac45115ef87d5c64b7a4b31fe85cb88a6cff4637c57918e4a809879e9624359a1488b86ce73e75900c1c19a6db3c6a3a2b46ff12"

RPROVIDES:${PN} += "libextractor-devel \
pkgconfig-libextractor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libextractor-common1 \
libextractor3"

inherit rpm
