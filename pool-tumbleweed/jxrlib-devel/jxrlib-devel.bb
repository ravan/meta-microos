SUMMARY = "Development files for jxrlib"
DESCRIPTION = "The jxrlib-devel package contains libraries and header files for \
developing applications that use jxrlib."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "jxrlib-devel-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "5bde5f49684cfb6bda6c00c20442d214103386e787f4597a4f497ef4893074a32f8b43040b1fa20ef0369438c1250d478849660881dd089c7cc1b2ff5d569df4"

RPROVIDES:${PN} += "jxrlib-devel"

RDEPENDS:${PN} += "libjpegxr0 \
libjxrglue0"

inherit rpm
