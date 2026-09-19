SUMMARY = "Boost.Serialization runtime library"
DESCRIPTION = "This package contains the Boost.Serialization runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_serialization1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "433df5f0db8d682ce34c5a9d1f0d47de19a6847db6fe0dd8b718cf13de484feb9828889868cec0d9f11107a1788dba6a4e9eb553b3c57ebd9d08092d1df5f152"

RPROVIDES:${PN} += "libboost-serialization.so.1.91.0 \
libboost-serialization1-91-0 \
libboost-wserialization.so.1.91.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
