SUMMARY = "A pure python-based utility to extract text and images from docx files"
DESCRIPTION = "A pure python-based utility to extract text and images from docx files. It can however also extract text from header, footer and hyperlinks."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python313-docx2txt-0.9-2.2.noarch.rpm"
RPM_HASH = "9961068c43a1f9c12cba18bbc59d527592a6cb1239df1194bcf5acb40671d102c71ac8e48c38af30725af2be1e91dbda13cf19b5f716d26542e1c737afab1db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docx2txt \
python3.13dist-docx2txt \
python313-docx2txt \
python3dist-docx2txt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
