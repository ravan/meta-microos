SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoDataMySQL123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "94c2beea5895c6dedfdf02ecccb43dee862301d7fdb90e2c421f3db9de1039c3f3cbdd0b04755b962543be9a6fe3d1a1a096825371fc77656e4bb2b31613b566"

RPROVIDES:${PN} += "libPocoDataMySQL.so.123 \
libPocoDataMySQL123 \
poco-datamysql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.123 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
