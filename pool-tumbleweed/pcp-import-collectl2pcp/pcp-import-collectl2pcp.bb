SUMMARY = "Performance Co-Pilot archive tools for importing collectl data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing collectl data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-import-collectl2pcp-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "2b22c4f9653e42e836d326f0e415a30cab19f92fb4f8c386073304554f624159758db4f7760a76372b1f44cbcff4b532530d1bfa2dc4f1e8857339c377d5c962"

RPROVIDES:${PN} += "pcp-import-collectl2pcp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-import.so.1 \
libpcp.so.3"

inherit rpm
