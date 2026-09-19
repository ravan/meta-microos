SUMMARY = "Python module for writing OOXML spreadsheet files"
DESCRIPTION = "XlsxWriter is a Python module for writing files in the Microsoft \
Office Open XML spreadsheet format. It can be used to write text, \
numbers, formulas and hyperlinks to multiple worksheets and it \
supports features such as formatting and many more."
LICENSE = "BSD-2-Clause"

PV = "3.2.9"

RPM_NAME = "python313-XlsxWriter-3.2.9-1.4.noarch.rpm"
RPM_HASH = "63f04430c4a2166b100a70a8cd5ba4ebc620a68a5b22f6677c3bf1694a3b255f03fddf585d175c747d614035db461215c92a26a4d4772f79cd2725741026ab39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XlsxWriter \
python3-xlsxwriter \
python3.13dist-xlsxwriter \
python313-XlsxWriter \
python3dist-xlsxwriter"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
