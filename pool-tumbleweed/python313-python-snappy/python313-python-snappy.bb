SUMMARY = "Python library for the snappy compression library"
DESCRIPTION = "Python library for the snappy compression library from Google."
LICENSE = "BSD-3-Clause"

PV = "0.7.3"

RPM_NAME = "python313-python-snappy-0.7.3-1.2.noarch.rpm"
RPM_HASH = "dbc325efdb6efde39337484790acbad1ffc2c249462beca8ecf551bff8b6e44a8df6d71300408ebe379665a6ed0650fb0b1e5656a6f1347732586bb2b833c357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-snappy \
python3.13dist-python-snappy \
python313-python-snappy \
python3dist-python-snappy"

RDEPENDS:${PN} += "python-abi \
python313-cramjam"

inherit rpm
