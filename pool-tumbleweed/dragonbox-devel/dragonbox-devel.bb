SUMMARY = "Header files for dragonbox, a float-to-string conversion library"
DESCRIPTION = "This library is a reference implementation of Dragonbox in C++. \
 \
Dragonbox is a float-to-string conversion algorithm based on a beautiful \
algorithm Schubfach, developed by Raffaello Giulietti in 2017-2018. \
Dragonbox is further inspired by Grisu and Grisu-Exact. \
 \
This package contains the headers."
LICENSE = "Apache-2.0 | BSL-1.0"

PV = "1.1.3"

RPM_NAME = "dragonbox-devel-1.1.3-3.11.aarch64.rpm"
RPM_HASH = "cbc94599cbeb674d6724c21fd016252b611cc3c8be860b34e3e86a93bcf0cfa8eaab254228e32740883f06fb8e3211e7a2c63dcd55792af3a2f642424b2ed8f7"

RPROVIDES:${PN} += "cmake-dragonbox \
dragonbox-devel"

RDEPENDS:${PN} += ""

inherit rpm
