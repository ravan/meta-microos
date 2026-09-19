SUMMARY = "Python LIGO Light-Weight XML I/O Library"
DESCRIPTION = "The LIGO Light-Weight XML format is used extensively by compact object \
detection pipeline and associated tool sets.  This package provides a Python \
I/O library for reading, writing, and interacting with documents in this \
format."
LICENSE = "GPL-3.0-only"

PV = "1.8.3"

RPM_NAME = "python314-ligo-lw-1.8.3-6.8.aarch64.rpm"
RPM_HASH = "63e128cad74c3b6117b3ea59907d5f1d92dc421755110f81ed1ddbaad1c98b8833e3c63224d69da2b613b5efadd66eb594763227bb44cb629f72ff52fc6145e7"

RPROVIDES:${PN} += "python3.14dist-python-ligo-lw \
python314-ligo-lw \
python3dist-python-ligo-lw"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-PyYAML \
python314-lal \
python314-ligo-segments \
python314-lscsoft-glue \
python314-numpy \
python314-python-dateutil \
python314-tqdm \
update-alternatives"

inherit rpm
