SUMMARY = "Include Files and Libraries for Ogg Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libogg."
LICENSE = "BSD-3-Clause"

PV = "1.3.6"

RPM_NAME = "libogg-devel-1.3.6-1.4.aarch64.rpm"
RPM_HASH = "a7fb705a5ac9efac41aa6a739a77968ef58977d471cc90367d85b9af50768dd3d7a84c9e983b05b65077039ef0d0df702a0b016ec44595d4ea8c4280f0c0f9b6"

RPROVIDES:${PN} += "cmake-Ogg \
libogg-devel \
pkgconfig-ogg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libogg0"

inherit rpm
