SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-devel-1.6.1-8.10.aarch64.rpm"
RPM_HASH = "85263dff6dbafe8e538d043b833443cf2345398e83007c92bc1d5b6ef1048bca7ba3c08b7c785759096f6987bdd0f8549eafa38a947054b4e21114c2a1f75884"

RPROVIDES:${PN} += "enchant-1-devel \
pkgconfig-enchant"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libenchant1 \
libstdc++-devel \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0"

inherit rpm
