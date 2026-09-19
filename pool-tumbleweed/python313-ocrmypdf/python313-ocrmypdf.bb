SUMMARY = "OCRmyPDF adds an OCR text layer to scanned PDF files"
DESCRIPTION = "OCRmyPDF adds an OCR text layer to scanned PDF files, allowing them to be searched"
LICENSE = "MPL-2.0"

PV = "17.4.2"

RPM_NAME = "python313-ocrmypdf-17.4.2-1.2.noarch.rpm"
RPM_HASH = "0a9e992a199a94d771c4396242a95aa2305dc591cc1449e994aeb49530158df405118fc2464a184852d94f39eaeb6326a5fb8553b160a058e33f9de114c5d6e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OCRmyPDF \
python3-ocrmypdf \
python3.13dist-ocrmypdf \
python313-ocrmypdf \
python3dist-ocrmypdf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ghostscript \
python-abi \
python313-Pillow \
python313-deprecation \
python313-fpdf2 \
python313-img2pdf \
python313-packaging \
python313-pdfminer.six \
python313-pikepdf \
python313-pluggy \
python313-pydantic \
python313-reportlab \
python313-rich \
python313-typing-extensions \
python313-uharfbuzz \
tesseract-ocr \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-eng \
update-alternatives"

inherit rpm
