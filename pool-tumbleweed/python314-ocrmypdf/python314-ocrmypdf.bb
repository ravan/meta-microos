SUMMARY = "OCRmyPDF adds an OCR text layer to scanned PDF files"
DESCRIPTION = "OCRmyPDF adds an OCR text layer to scanned PDF files, allowing them to be searched"
LICENSE = "MPL-2.0"

PV = "17.4.2"

RPM_NAME = "python314-ocrmypdf-17.4.2-1.2.noarch.rpm"
RPM_HASH = "52483a06508aee8ff4c6a02a65a1460e1001249bcb447b278150d698d4f73617c45b3f998e6142b7615af1b2d830396ee45e23c9891c72d1039437c8f09d21b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OCRmyPDF \
python3.14dist-ocrmypdf \
python314-ocrmypdf \
python3dist-ocrmypdf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ghostscript \
python-abi \
python314-Pillow \
python314-deprecation \
python314-fpdf2 \
python314-img2pdf \
python314-packaging \
python314-pdfminer.six \
python314-pikepdf \
python314-pluggy \
python314-pydantic \
python314-reportlab \
python314-rich \
python314-typing-extensions \
python314-uharfbuzz \
tesseract-ocr \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-eng \
update-alternatives"

inherit rpm
