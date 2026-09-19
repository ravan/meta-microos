SUMMARY = "BiDi layout algorithm"
DESCRIPTION = "A pure python implementation of the BiDi layout algorithm."
LICENSE = "LGPL-3.0-only"

PV = "0.6.7"

RPM_NAME = "python314-python-bidi-0.6.7-1.8.aarch64.rpm"
RPM_HASH = "9f8a48cf27bf7ff27837168d769bddae09a9b9e7bc3bf9ee4288854a70fd083aeffc8140f4ce8e27562fa85d3193df0b661a29ab5fd30475dc8d6d54f7aad4e6"

RPROVIDES:${PN} += "python3.14dist-python-bidi \
python314-python-bidi \
python3dist-python-bidi"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
update-alternatives"

inherit rpm
