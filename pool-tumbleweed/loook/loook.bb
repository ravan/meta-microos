SUMMARY = "Search strings in ODF documents"
DESCRIPTION = "This program is a program written in Python that searches for strings \
in files created by OpenOffice.org, Apache OpenOffice, LibreOffice or \
StarOffice 6.0 or higher. This is especially true for all documents \
that were created in the Open Document Format. In addition, it can now \
also search in documents created by Microsoft Word, Excel or PowerPoint \
from the 2007 version in an OOXML format."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.0"

RPM_NAME = "loook-0.9.0-1.14.noarch.rpm"
RPM_HASH = "cc020d679e4c431da2474806af07d157af19958edfb230d333a06ea5f4523afcaa2b9db0669c1b35d05e92622bb657833b3cba7bc48557f5787c336e0562c55d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "loook"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-base \
python3-tk"

inherit rpm
