SUMMARY = "Development files for the Small Footprint CIM Client Library"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Header Files and Link \
Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.9~rc1"

RPM_NAME = "sblim-sfcc-devel-2.2.9~rc1-1.11.aarch64.rpm"
RPM_HASH = "757cee4ed7888d139dc6f10cf098fe136d7cb3e2f258a5af7566c55aa7099baf1f9b58a874f4e9148d670a434040574084601050b63a3ebae4691dc8a0d43b2a"

RPROVIDES:${PN} += "sblim-sfcc-devel"

RDEPENDS:${PN} += "glibc-devel \
libcimcClientXML0 \
libcimcclient0 \
libcmpisfcc1"

inherit rpm
