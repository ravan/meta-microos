SUMMARY = "Development files for the lastlog2 library"
DESCRIPTION = "Files to develop applications using the liblastlog2 library."
LICENSE = "BSD-2-Clause"

PV = "2.42.2"

RPM_NAME = "liblastlog2-devel-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "c4d8aca50d4440604d4a632135c1aaaf52ec038c175b32257208e2301710c7ecf03c0081ddeb696404535c9c7533da855566decd44c42d6f1e6d65bb37bafdf1"

RPROVIDES:${PN} += "lastlog2-devel \
liblastlog2-devel"

RDEPENDS:${PN} += "liblastlog2-2"

inherit rpm
