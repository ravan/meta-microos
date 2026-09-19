SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoDataPostgreSQL123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "1ad73a3963bfd95d97c8880433c726ce2e734fcf5f782c4068fa1d3552acefb3cd222ff12224ac6891f398fef3951b0d66c9476a8eeb67d78811db06cde93917"

RPROVIDES:${PN} += "libPocoDataPostgreSQL.so.123 \
libPocoDataPostgreSQL123 \
poco-datapostgresql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.123 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
