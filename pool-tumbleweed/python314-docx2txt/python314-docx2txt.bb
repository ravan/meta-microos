SUMMARY = "A pure python-based utility to extract text and images from docx files"
DESCRIPTION = "A pure python-based utility to extract text and images from docx files. It can however also extract text from header, footer and hyperlinks."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "python314-docx2txt-0.9-2.2.noarch.rpm"
RPM_HASH = "bf68dbcc37370979168205b9101393e405d715a9c7fcca40c273fc0945fa27d930fa10ecb8c0a027bcc4b9d144ae50b43f3255accec87c0f59134af461688dff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-docx2txt \
python314-docx2txt \
python3dist-docx2txt"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
