SUMMARY = "SunPy core package: Python for Solar Physics"
DESCRIPTION = "SunPy is a Python library for solar physics data analysis and visualization."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT"

PV = "7.1.2"

RPM_NAME = "python314-sunpy-7.1.2-2.2.aarch64.rpm"
RPM_HASH = "ab9f882e5b487df65eea05649db18d851413df0ba14615c6315cf65fd38144651262e262ac76e2d19dc6119467b8a956bcfd694a6f6fc162c852dd9a6da005d6"

RPROVIDES:${PN} += "python3.14dist-sunpy \
python314-sunpy \
python3dist-sunpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-aioftp \
python314-astropy \
python314-fsspec \
python314-numpy \
python314-packaging \
python314-parfive \
python314-pyerfa \
python314-requests"

inherit rpm
