SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20260107"

RPM_NAME = "python313-pdfminer.six-20260107-1.3.noarch.rpm"
RPM_HASH = "548b28889ead390d72800674c5ff37201ba522369359be7519c68a9bfb1ad5e7a97af1bf8018b07407c9e672cc918690381180027324339810d2b079ebdad473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdfminer.six \
python3-pdfminer3k \
python3.13dist-pdfminer.six \
python313-pdfminer.six \
python313-pdfminer3k \
python3dist-pdfminer.six"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-charset-normalizer \
python313-cryptography"

inherit rpm
