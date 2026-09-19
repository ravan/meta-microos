SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python313-pyo-1.0.6-1.7.aarch64.rpm"
RPM_HASH = "c0e04e1d0dd9cc71ad5e0688218ad0f2ba9cc1908e14cf8dd480b89e972f0b195d61b4ce6ffe16498ef0f3980b53588b6eec6818661cb0a21c3dcb596df0b3f1"

RPROVIDES:${PN} += "python3-pyo \
python3.13dist-pyo \
python313-pyo \
python3dist-pyo"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
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
