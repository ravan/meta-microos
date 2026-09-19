SUMMARY = "A C++ SSH/SFTP library based on libfilezilla"
DESCRIPTION = "fzssh is a SSH/SFTP library based on libfilezilla"
LICENSE = "AGPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "libfzssh14_0_0-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "45fabe7def31c8dddaba84bf588585bb26eae7585bcb4e55924c7b3244037d2ee34c16e27678c038edd7541a57c768fbe960023c46e2ae4c64d76844f63cee01"

RPROVIDES:${PN} += "libfzssh \
libfzssh-client.so.14.0.0 \
libfzssh-crypt.so.14.0.0 \
libfzssh.so.14.0.0 \
libfzssh14-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libfilezilla.so.59 \
libgcc-s.so.1 \
libgmp.so.10 \
libhogweed.so.6 \
libnettle.so.8 \
libstdc++.so.6"

inherit rpm
