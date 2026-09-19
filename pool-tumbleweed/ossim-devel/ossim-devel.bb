SUMMARY = "Header files for the Open Source Software Image Map"
DESCRIPTION = "The OSSIM development files. \
Open Source Software Image Map (OSSIM) is an engine for \
remote sensing, image processing, geographical information systems and \
photogrammetry."
LICENSE = "LGPL-3.0-only"

PV = "2.12.1"

RPM_NAME = "ossim-devel-2.12.1-1.1.aarch64.rpm"
RPM_HASH = "e92ca5ff8a266cb953b20fe8154eaef616314f3b3c9af9a8401e84fd2135f35abdaed444ad5cf0fab5e68b2155dfd39d84b5d76b1bede963aff5c7198d016a89"

RPROVIDES:${PN} += "ossim-devel"

RDEPENDS:${PN} += "libossim2"

inherit rpm
