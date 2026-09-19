SUMMARY = "Python integration for the Duktape Javascript interpreter"
DESCRIPTION = "Python integration for the Duktape Javascript interpreter"
LICENSE = "GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "python313-pyduktape2-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "b6f9a9ee77ed9b23642b910ebf3d660482014aab9764c13d5603f6148ed703b80191066df052080fd3137c99ce7871ee6c38c82d6d104dcca05f50f364874e51"

RPROVIDES:${PN} += "python3-pyduktape2 \
python3.13dist-pyduktape2 \
python313-pyduktape2 \
python3dist-pyduktape2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-Cython"

inherit rpm
