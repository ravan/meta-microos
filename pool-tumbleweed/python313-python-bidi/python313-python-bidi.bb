SUMMARY = "BiDi layout algorithm"
DESCRIPTION = "A pure python implementation of the BiDi layout algorithm."
LICENSE = "LGPL-3.0-only"

PV = "0.6.7"

RPM_NAME = "python313-python-bidi-0.6.7-1.8.aarch64.rpm"
RPM_HASH = "0beb2d3f5c5c02b82989e8ecd1acfb76aff280e2716c5331d261e200d8e3a307dbc2857af039058a1d23947786d1fae443655505e1fb7bbfd4a698674994ea92"

RPROVIDES:${PN} += "python3-python-bidi \
python3.13dist-python-bidi \
python313-python-bidi \
python3dist-python-bidi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
update-alternatives"

inherit rpm
