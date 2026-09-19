SUMMARY = "Python LIGO Light-Weight XML I/O Library"
DESCRIPTION = "The LIGO Light-Weight XML format is used extensively by compact object \
detection pipeline and associated tool sets.  This package provides a Python \
I/O library for reading, writing, and interacting with documents in this \
format."
LICENSE = "GPL-3.0-only"

PV = "1.8.3"

RPM_NAME = "python313-ligo-lw-1.8.3-6.8.aarch64.rpm"
RPM_HASH = "3de27bd6797244d0b2c0aa51103b976a15da7460799450172f5c563eab2c5a9aca8d576e82c17273f4ecefed2113cc27d83e762abf42bbea770b998cf0cc9b32"

RPROVIDES:${PN} += "python3-ligo-lw \
python3.13dist-python-ligo-lw \
python313-ligo-lw \
python3dist-python-ligo-lw"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-PyYAML \
python313-lal \
python313-ligo-segments \
python313-lscsoft-glue \
python313-numpy \
python313-python-dateutil \
python313-tqdm \
update-alternatives"

inherit rpm
