SUMMARY = "Plugin libffi for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for libffi."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-libffi-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "c36c1dad77b6dbe37c2924847b3578eb834395c8da83560b15e40a5e177e113bc16474190b3a9793d364028c819d48264152aa4a6ca4a6615f4d8190e0e24088"

RPROVIDES:${PN} += "libffi-plugin.so \
uwsgi-libffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
uwsgi"

inherit rpm
