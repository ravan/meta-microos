SUMMARY = "Development files for libmsym"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "libmsym-devel-0.2.3-4.3.aarch64.rpm"
RPM_HASH = "90c7bb5bcf6868d9eb85d68f382c4484188af89568ada8d1d9af856dbf6c872152dd4485be31019e2bca062d0c4ce22c9ddf30d140064b6c95104eea8e786b07"

RPROVIDES:${PN} += "cmake-libmsym \
libmsym-devel"

RDEPENDS:${PN} += "libmsym0-2"

inherit rpm
