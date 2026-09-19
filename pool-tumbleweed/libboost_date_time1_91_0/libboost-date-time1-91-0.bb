SUMMARY = "Boost.DateTime runtime library"
DESCRIPTION = "This package contains the Boost Date.DateTime runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_date_time1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "ec8ec3b57080981314c44d385a43b1f3bfda2ade2a92970c124da2a647634605241a98ff6bdb4dc12643c4aee5ec0889769710bce1986b2b67e19d435692ed45"

RPROVIDES:${PN} += "libboost-date-time.so.1.91.0 \
libboost-date-time1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0"

inherit rpm
