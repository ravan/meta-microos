SUMMARY = "MariaDB embedded server library"
DESCRIPTION = "This package contains MariaDB library that allows to run an embedded \
MariaDB server inside a client application."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "12.3.2"

RPM_NAME = "libmariadbd19-12.3.2-1.3.aarch64.rpm"
RPM_HASH = "307919f1444856c47bc1dd565974a426f3e9080f1024d302a9d3153d12bd4159d8b85f9bfac4f503a608dfb2c8b344de104c2c74cfe7b5ff4f0623d52c9558be"

RPROVIDES:${PN} += "libmariadbd.so.19 \
libmariadbd19 \
libmysqld"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
mariadb-errormessages"

inherit rpm
