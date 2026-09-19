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

RPM_NAME = "python314-pytesseract-0.3.13-2.7.noarch.rpm"
RPM_HASH = "822d6c19b0a24b49f513ef25fcbdc34c9f7d8d48353a3412284cc7a40c854043c9cb191080b620a7b44eba6f0d5ccb1cc2b98deeb89f0de4b0b586402f594594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytesseract \
python314-pytesseract \
python3dist-pytesseract"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
pkgconfig-tesseract \
python-abi \
python314-Pillow \
python314-packaging \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-eng \
update-alternatives"

inherit rpm
