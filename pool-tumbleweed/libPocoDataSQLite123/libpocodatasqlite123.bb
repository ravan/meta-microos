SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoDataSQLite123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "90781feb96ac09f083f8fe773b6b95a9804f2996de2fb69b25c3d3ee20f0e2e4913c1872e2e2adce0d59f38fe4d532ada6a3b91f4f886635ffd3ef018312f11c"

RPROVIDES:${PN} += "libPocoDataSQLite.so.123 \
libPocoDataSQLite123 \
poco-datasqlite"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.123 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
