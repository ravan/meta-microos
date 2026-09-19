SUMMARY = "Development headers for Boost.Chrono library"
DESCRIPTION = "This package contains Boost.Chrono development headers. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_chrono-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "3692d36cd82c6c30dd3eb24c9e9fa9be138c47a7efaec801a301cc88f5d66581d43f75dc97f13daf9350f97308cf078d4c3e6bcd9b5f78473b6b91f67980485b"

RPROVIDES:${PN} += "libboost-chrono-devel"

RDEPENDS:${PN} += "libboost-chrono1-91-0-devel"

inherit rpm
