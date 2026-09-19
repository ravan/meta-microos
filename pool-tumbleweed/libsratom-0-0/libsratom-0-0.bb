SUMMARY = "A library for serialising LV2 atoms to/from RDF"
DESCRIPTION = "A library for serialising LV2 atoms to/from RDF, particularly the Turtle syntax."
LICENSE = "ISC"

PV = "0.6.22"

RPM_NAME = "libsratom-0-0-0.6.22-1.3.aarch64.rpm"
RPM_HASH = "e65e32fbd39e8e712854944aab33f6bdb554345f96e093f69ee3eb4dc52ecf076a5989d98129022156af38cbd48a7df806acb5e424aa3a470d19f0e6dfbc6cbf"

RPROVIDES:${PN} += "libsratom-0-0 \
libsratom-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libserd-0.so.0 \
libsord-0.so.0"

inherit rpm
