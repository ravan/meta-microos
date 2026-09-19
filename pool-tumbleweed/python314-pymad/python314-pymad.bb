SUMMARY = "Python Module to use the MPEG Audio Decoder Library"
DESCRIPTION = "pymad is a Python module that allows Python programs to use the MPEG Audio \
Decoder library. pymad provides a high-level API, similar to the pyogg module, \
allowing to read PCM data from MPEG audio streams."
LICENSE = "LGPL-2.0-or-later"

PV = "0.11.3"

RPM_NAME = "python314-pymad-0.11.3-2.7.aarch64.rpm"
RPM_HASH = "85f0a6ade638bfb198577aeeb375fb8f26b1fa476913de4df3a4ddf644e85c487f8073748d43aa63b8924001ecf7939ed212aca7289579dc9f229f8dd28dd469"

RPROVIDES:${PN} += "python3.14dist-pymad \
python314-pymad \
python3dist-pymad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmad.so.0 \
python-abi"

inherit rpm
