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

RPM_NAME = "python313-tesserocr-2.9.2-3.5.aarch64.rpm"
RPM_HASH = "093ab59f07f510b358b774106137978452abe193b47107186d5b7e1b7a1583a28ca0491087cfab1d2566aaa66e3d331a490ae94b5c8f684347f6499c89b5563d"

RPROVIDES:${PN} += "python3-tesserocr \
python3.13dist-tesserocr \
python313-tesserocr \
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
