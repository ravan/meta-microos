SUMMARY = "Gevent Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python Gevent, which is a non-blocking \
networking framework."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-gevent-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "1842591c10e80b28762d7b5f3098b7df0b32bc040acd87e3f23ad150b60243b5f21c4828e9239909f5f23410befe9b747312ed0c662930b7b15a7a6db151b278"

RPROVIDES:${PN} += "uwsgi-gevent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi \
uwsgi-python3"

inherit rpm
