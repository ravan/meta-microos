SUMMARY = "Greenlet Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for the Python Greenlet non-blocking network \
framework."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-greenlet-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "f80b8043f9d4748e692e8b4c1749afac7a6f928ab27506c555525cddb65f53046f642cd1c01f3f5ba7e4d430438985b9cffe103fe9d7d2046d3e798cf4cf0b24"

RPROVIDES:${PN} += "uwsgi-greenlet"

RDEPENDS:${PN} += "libc.so.6 \
uwsgi \
uwsgi-python3"

inherit rpm
