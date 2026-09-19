SUMMARY = "Python wrapper for Google's Tesseract-OCR"
DESCRIPTION = "Python-tesseract is an optical character recognition (OCR) tool for Python, \
that is, it will recognize and 'read' the text embedded in images. \
 \
Python-tesseract is a wrapper for Google's Tesseract-OCR Engine. It can be used \
as a stand-alone invocation script to tesseract, as it can read all image types \
supported by the Python Imaging Library, including JPEG, PNG, GIF, BMP, TIFF, \
and others, whereas tesseract-ocr, by default, only supports TIFF and BMP. \
Additionally, if used as a script, python-tesseract will print the recognized \
text instead of writing it to a file. There is no support for confidence estimates and \
bounding box data is planned for future releases."
LICENSE = "Apache-2.0"

PV = "0.3.13"

RPM_NAME = "python313-pytesseract-0.3.13-2.7.noarch.rpm"
RPM_HASH = "79b0453249f9f9765264d8aa5c978ab2de0bea68cb897230a9e0a9ddf6d776a2b8f181333b10a28ace916cb170aa1f18807b571aa3ec3ba65d4529e29056810b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytesseract \
python3.13dist-pytesseract \
python313-pytesseract \
python3dist-pytesseract"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
pkgconfig-tesseract \
python-abi \
python313-Pillow \
python313-packaging \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-eng \
update-alternatives"

inherit rpm
