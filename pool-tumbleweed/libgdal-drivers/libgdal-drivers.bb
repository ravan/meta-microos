SUMMARY = "GDAL static libraries drivers files"
DESCRIPTION = "Drivers information for library"
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "libgdal-drivers-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "603338a15b4473a5e32df23adffe0645bbaf0895b132d630649928e806236267b3839b0468b4c45f577b0611a69a5637b11b3ebcf3d75698cca5b2ddcbf547a2"

RPROVIDES:${PN} += "libgdal-drivers"

RDEPENDS:${PN} += ""

inherit rpm
