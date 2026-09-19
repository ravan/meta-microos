SUMMARY = "ZMQ Logger for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for ZMQ logging."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-logzmq-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "76cccfa2f31bd3653f45f0c0f2cbcddb06e205bcf8e908f141f4f3799bbc20d63a0abe20b200c17eab29939f346dd19763de7f5c42c3d4fe54d3f2e95ba197e0"

RPROVIDES:${PN} += "uwsgi-logzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
uwsgi"

inherit rpm
