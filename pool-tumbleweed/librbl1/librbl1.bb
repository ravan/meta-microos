SUMMARY = "Realtime Blacklist (RBL) service library"
DESCRIPTION = "This package provides librbl which is an interface \
to a facility to conduct Realtime Blacklist (RBL) \
queries and return their results.  RBLs are described in RFC5782."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "librbl1-2.11.0-13.5.aarch64.rpm"
RPM_HASH = "81f8dd7fc1c4b41eeea0a82bbae104a5b0ce3c3bd2f348dcd1817f38a85547923b62271d5939a43e860cb0b838a77ca6cdb3c24ece0899330e12bbef396592a5"

RPROVIDES:${PN} += "librbl.so.1 \
librbl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
