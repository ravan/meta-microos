SUMMARY = "Python integration for the Duktape Javascript interpreter"
DESCRIPTION = "Python integration for the Duktape Javascript interpreter"
LICENSE = "GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "python314-pyduktape2-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "4b34800a3db9d34455e6594ae220e02fac94723bee1fbeab048ddf730d250549d2784bb4e529c2de3a4970943750b049c7751f105e3b8c4bb18d34df5a4669df"

RPROVIDES:${PN} += "python3.14dist-pyduktape2 \
python314-pyduktape2 \
python3dist-pyduktape2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-Cython"

inherit rpm
