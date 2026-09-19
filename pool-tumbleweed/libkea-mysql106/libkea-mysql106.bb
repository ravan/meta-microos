SUMMARY = "Kea MySQL database library"
DESCRIPTION = "Kea's database library for MySQL."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-mysql106-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "7ed051f38b9c2a54c92d355423eab03d5cc3342932893f3794c230dff0d7eaa0a59532343faa5ab87d8ec3f90b72b7632760171f3f37cae0317fed13ea17647f"

RPROVIDES:${PN} += "libkea-mysql.so.106 \
libkea-mysql106"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-database.so.88 \
libkea-exceptions.so.55 \
libkea-log.so.86 \
libkea-util.so.118 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
