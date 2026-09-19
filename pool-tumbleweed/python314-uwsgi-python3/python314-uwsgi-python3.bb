SUMMARY = "Python 3.14 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.14 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "python314-uwsgi-python3-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "89112e455823dd60e320b6c9ea3e3feea168e3364afca5610bd99f0feb745f53bebbcb4a2456e3130ea1a6ab98ae77f889dfe7959bfa2efd5b1cc24a25310306"

RPROVIDES:${PN} += "python314-uwsgi-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.14.so.1.0 \
python-abi \
uwsgi"

inherit rpm
