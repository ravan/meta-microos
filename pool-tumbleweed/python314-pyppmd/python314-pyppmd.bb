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

RPM_NAME = "python314-pyppmd-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "f4ed567e26966bf2ae8d8d9383daf826912a3a17de805c03d2838905b480c1b7d237d68ec323d7bd9f47cae8b9bfd75349207f7faa27f338231066dc8da7435b"

RPROVIDES:${PN} += "python3.14dist-pyppmd \
python314-pyppmd \
python3dist-pyppmd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
