SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python314-pyo-1.0.6-1.7.aarch64.rpm"
RPM_HASH = "fdfc9c44e7383dc96f1dd335bbb88bbdd923e9d02cbefa52cac99e7b2f68321667dbce2142f84716b2f2ee1686c17976f230cd23c47a4d4a7326a4b67a278e87"

RPROVIDES:${PN} += "python3.14dist-pyo \
python314-pyo \
python3dist-pyo"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libportaudio.so.2 \
libportmidi.so.2 \
libsndfile.so.1 \
python-abi"

inherit rpm
