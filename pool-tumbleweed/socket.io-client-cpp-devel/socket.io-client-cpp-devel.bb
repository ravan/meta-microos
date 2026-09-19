SUMMARY = "Development files for libm2k"
DESCRIPTION = "Development files for Socket.IO client"
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "socket.io-client-cpp-devel-3.1.0-2.5.aarch64.rpm"
RPM_HASH = "5acda0bd4aeab541aa110a69b9006c1aac6256ccb68e478a473704fcdf84081908c89f42ee48be45fce9fdc3630add537a95d36904901063344771728636fe2d"

RPROVIDES:${PN} += "socket.io-client-cpp-devel"

RDEPENDS:${PN} += "libsioclient1"

inherit rpm
