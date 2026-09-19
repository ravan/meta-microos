SUMMARY = "Development files for libLimeSuite"
DESCRIPTION = "Libraries and header files for developing applications that want to make \
use of libLimeSuite."
LICENSE = "Apache-2.0"

PV = "23.11.0"

RPM_NAME = "limesuite-devel-23.11.0-4.1.aarch64.rpm"
RPM_HASH = "ff4883fa8fc30493cfedd7149c7843fc9f9e9902904965e0cdacb3cff77d8a5b3f1c7da086c66ba8b6e35180c827edca8aa6951e9632dd13ca010514aa0bf036"

RPROVIDES:${PN} += "cmake-LimeSuite \
limesuite-devel \
pkgconfig-LimeSuite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libLimeSuite23-11-1"

inherit rpm
