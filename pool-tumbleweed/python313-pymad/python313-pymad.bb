SUMMARY = "Python Module to use the MPEG Audio Decoder Library"
DESCRIPTION = "pymad is a Python module that allows Python programs to use the MPEG Audio \
Decoder library. pymad provides a high-level API, similar to the pyogg module, \
allowing to read PCM data from MPEG audio streams."
LICENSE = "LGPL-2.0-or-later"

PV = "0.11.3"

RPM_NAME = "python313-pymad-0.11.3-2.7.aarch64.rpm"
RPM_HASH = "f1bd003351fce0f5bc97e0c349433978c0952976e629cf8e3f9c20f7c5dcca4b76907ff649abbcd6a698dac4ee0dd19f519e019e46f6ff9d293010845a6d3e04"

RPROVIDES:${PN} += "python3-pymad \
python3.13dist-pymad \
python313-pymad \
python3dist-pymad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmad.so.0 \
python-abi"

inherit rpm
