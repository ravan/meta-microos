SUMMARY = "Header files for the SPOOLES library"
DESCRIPTION = "spooles-openmpi-devel provides the header file for the SPOOLES library."
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "spooles-openmpi-devel-2.2-3.8.aarch64.rpm"
RPM_HASH = "63ea2590bfeb8fb0d39241afff1f876cb0a127b0bff3ceb59f2dd329c693590214a2ddef7e9abfe559516080210d1cab9f56472e519aceafe253ff115a95e6ae"

RPROVIDES:${PN} += "spooles-openmpi-devel"

RDEPENDS:${PN} += "libspooles2-2-openmpi \
openmpi5-devel"

inherit rpm
