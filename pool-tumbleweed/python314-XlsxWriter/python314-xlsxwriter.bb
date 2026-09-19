SUMMARY = "Python module for writing OOXML spreadsheet files"
DESCRIPTION = "XlsxWriter is a Python module for writing files in the Microsoft \
Office Open XML spreadsheet format. It can be used to write text, \
numbers, formulas and hyperlinks to multiple worksheets and it \
supports features such as formatting and many more."
LICENSE = "BSD-2-Clause"

PV = "3.2.9"

RPM_NAME = "python314-XlsxWriter-3.2.9-1.4.noarch.rpm"
RPM_HASH = "17b290b5b2ccb7963f8fce6fb9324d1bfb7f350570bd06a560df1c624c99e74a6f5ead4b71ee5e2e3e626d9cf8fdc2050bec12d9b93597a42adf1c97d5369399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlsxwriter \
python3.14dist-xlsxwriter \
python314-XlsxWriter \
python3dist-xlsxwriter"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
