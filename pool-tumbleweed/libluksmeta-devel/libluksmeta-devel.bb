SUMMARY = "Development files for libluksmeta"
DESCRIPTION = "The libluksmeta-devel package contains libraries and header files for \
developing applications that use libluksmeta."
LICENSE = "LGPL-2.1-or-later"

PV = "9"

RPM_NAME = "libluksmeta-devel-9-1.11.aarch64.rpm"
RPM_HASH = "a6829e352491af1f0c6ac0e90f5017aed5469416069edbf82394139d79d1894a4230f156d479c7cadc35b7d4c1def27532df1ea7bbd18f42013275122b536e43"

RPROVIDES:${PN} += "libluksmeta-devel \
pkgconfig-luksmeta"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libluksmeta0 \
pkgconfig-libcryptsetup"

inherit rpm
