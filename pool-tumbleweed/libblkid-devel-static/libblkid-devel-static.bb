SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libblkid-devel-static-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "39b9cd49a7096b50ec940162651a6f5cf750d4b71afb19d94489d93c48121335976995c64f8c438a976db20d3dc70f8052adb023d5f5f0d293f9cd2e19780729"

RPROVIDES:${PN} += "libblkid-devel-static"

RDEPENDS:${PN} += "libblkid-devel \
libeconf-devel-static"

inherit rpm
