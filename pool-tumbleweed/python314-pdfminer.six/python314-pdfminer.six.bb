SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20260107"

RPM_NAME = "python314-pdfminer.six-20260107-1.3.noarch.rpm"
RPM_HASH = "0b48006ba950ecda7ad1ba6605f5ad196e2afc2fc5ab6d023458a431c1ec7e37ba9f628061f6341b58b550f7409e14251f12cd69e36ac5572fa55010dd62e5e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pdfminer.six \
python314-pdfminer.six \
python314-pdfminer3k \
python3dist-pdfminer.six"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-charset-normalizer \
python314-cryptography"

inherit rpm
