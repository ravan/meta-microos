SUMMARY = "Python 3 bindings for the librepo library"
DESCRIPTION = "This package provides the Python 3 bindings for the librepo library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "python3-librepo-1.20.0-3.1.aarch64.rpm"
RPM_HASH = "dda92c8179ad62ef804dd80c95868f20d6fe26817ec3a964405f9ad81eaa176424e7a5e21e5be50f19ff895e4485bb25d58d8d7250ee7e0d681e21925bcf1f64"

RPROVIDES:${PN} += "python3-librepo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpython3.13.so.1.0 \
librepo.so.0 \
librepo0 \
python-abi"

inherit rpm
