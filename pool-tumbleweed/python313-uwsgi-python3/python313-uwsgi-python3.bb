SUMMARY = "Python 3.13 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.13 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "python313-uwsgi-python3-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "25245a213c7188a6eb04e87304f7f564e47e1bb40e540e81e3e8223a3b064fc9bb44693066c1c01a2847ea1d2332bf75ae49f0738ba6d99c077f1d7dafa27256"

RPROVIDES:${PN} += "python3-uwsgi-python3 \
python313-uwsgi-python3 \
uwsgi-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
python-abi \
uwsgi"

inherit rpm
