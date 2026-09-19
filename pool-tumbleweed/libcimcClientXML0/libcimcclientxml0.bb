SUMMARY = "Small Footprint CIM Client Library"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Runtime Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.9~rc1"

RPM_NAME = "libcimcClientXML0-2.2.9~rc1-1.11.aarch64.rpm"
RPM_HASH = "43fd4a618efbcceb7bcac414849e2c1e34c3794893068caeb14ee5fff4b68042ca167522999b57ccab518f5190a7346dc083498fd219dec9bf1e7fb569b26235"

RPROVIDES:${PN} += "libcimcClientXML.so.0 \
libcimcClientXML0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm
