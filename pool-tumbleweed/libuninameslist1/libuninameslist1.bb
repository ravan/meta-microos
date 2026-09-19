SUMMARY = "A library providing Unicode character names and annotations"
DESCRIPTION = "libuninameslist provides Unicode name and annotation data from the official \
Unicode Character Database."
LICENSE = "BSD-3-Clause"

PV = "20260107"

RPM_NAME = "libuninameslist1-20260107-1.3.aarch64.rpm"
RPM_HASH = "adf2d5b0a839fb06b107e8ec35aeaecf8628257e885603f1660f664ca936f465756a6795f8109ea6e3c591784f7355f0c1161b24038dbb5a0ea54999d61fbb7a"

RPROVIDES:${PN} += "libuninameslist-fr.so.1 \
libuninameslist.so.1 \
libuninameslist1"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
