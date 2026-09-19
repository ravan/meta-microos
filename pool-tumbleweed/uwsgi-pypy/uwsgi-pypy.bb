SUMMARY = "PyPy Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python applications using PyPy."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-pypy-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "104268972f15b3a2a25b516154eff7a7b8ef712efe322a5684a51d9e09ae8fd5296dc338b50366b72c8e2fd034023475314a61b646448e1c3850ed2de6b15893"

RPROVIDES:${PN} += "uwsgi-pypy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi"

inherit rpm
