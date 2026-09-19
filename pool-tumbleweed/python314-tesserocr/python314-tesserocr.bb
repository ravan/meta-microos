SUMMARY = "A Python wrapper around tesseract-ocr"
DESCRIPTION = "A wrapper around the tesseract-ocr API for Optical Character \
Recognition (OCR). \
 \
tesserocr integrates directly with Tesseract's C++ API using Cython \
which allows for Pythonic source code. It enables real concurrent \
execution when used with Python's threading module by releasing the \
GIL while processing an image in tesseract."
LICENSE = "MIT"

PV = "2.9.2"

RPM_NAME = "python314-tesserocr-2.9.2-3.5.aarch64.rpm"
RPM_HASH = "fb3adff1e2a07d7dec02cd8be4fff680104a560c882edd974542702e34da092948ae23e0d59385cb553a2222960b9d08b9236f2eb77ecf4fda614d743c102b3e"

RPROVIDES:${PN} += "python3.14dist-tesserocr \
python314-tesserocr \
python3dist-tesserocr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleptonica.so.6 \
libstdc++.so.6 \
libtesseract.so.5 \
python-abi \
tesseract-ocr-traineddata-english \
tesseract-ocr-traineddata-orientation-and-script-detection"

inherit rpm
