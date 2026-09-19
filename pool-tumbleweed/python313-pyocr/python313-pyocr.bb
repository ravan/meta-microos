SUMMARY = "Python wrapper for OCR engines"
DESCRIPTION = "PyOCR is an optical character recognition (OCR) tool wrapper for python. \
That is, it helps using various OCR tools from a Python program."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.5"

RPM_NAME = "python313-pyocr-0.8.5-1.13.noarch.rpm"
RPM_HASH = "59e0c375e2f4d54ca130f00a45045dfb8d824f7eb088f407be68729f3a323ba609e56a4b5c7a6bdb2d6ae031cec5b31b5e3956de1d2e2df25352027b434477bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyocr \
python3.13dist-pyocr \
python313-pyocr \
python3dist-pyocr"

RDEPENDS:${PN} += "python-abi \
python313-Pillow"

inherit rpm
