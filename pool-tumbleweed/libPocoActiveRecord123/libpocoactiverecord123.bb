SUMMARY = "POCO C++ Active Record"
DESCRIPTION = "ActiveRecord is a simple and lightweight object-relational mapping (ORM) \
framework based on the Active Record pattern and the Data library."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoActiveRecord123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "8bc29c35a6be80d6dd7dc7fafdacecc0514bb7a51ea450a85ed3d9d678ff0908e126cf1b8a8f7b1a90f5af42a0e1546d7f7d37830d52d443faddf2ada0300823"

RPROVIDES:${PN} += "libPocoActiveRecord.so.123 \
libPocoActiveRecord123"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.123 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
