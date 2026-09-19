SUMMARY = "PPMd compression/decompression library"
DESCRIPTION = "The pyppmd module provides classes and functions for compressing and \
decompressing text data, using PPM(Prediction by partial matching) \
compression algorithm which has several variations of implementations. \
PPMd is the implementation by Dmitry Shkarin. PyPPMD use Igor Pavlov's \
range coder introduced in 7-zip. \
 \
The API is similar to Python's bz2/lzma/zlib module. \
 \
Some parts of th codes are derived from 7-zip, pyzstd and ppmd-cffi."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "python313-pyppmd-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "f4e605c778cda15bbc8b6dc75fdd975cf9be3b320e826924b14715b227867c5f616ab898390950edd5ddfff195d8776fbd8c6fa29a6b7d24c526c662c57a6a24"

RPROVIDES:${PN} += "python3-pyppmd \
python3.13dist-pyppmd \
python313-pyppmd \
python3dist-pyppmd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
