SUMMARY = "Parse XLSX files"
DESCRIPTION = "This module is an adaptor for Spreadsheet::ParseExcel that reads XLSX \
files. For documentation about the various data that you can retrieve from \
these classes, please see Spreadsheet::ParseExcel, \
Spreadsheet::ParseExcel::Workbook, Spreadsheet::ParseExcel::Worksheet, and \
Spreadsheet::ParseExcel::Cell."
LICENSE = "MIT"

PV = "0.370.0"

RPM_NAME = "perl-Spreadsheet-ParseXLSX-0.370.0-1.3.noarch.rpm"
RPM_HASH = "26e170b775f31732009cfdecc7b56c6880c77000cd9c4dfee35a912935e829446f5beb779a1ed11e88bae714c4f01bb3bc96b81beeae66f67f55f64e3e3c32db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--ParseXLSX \
perl-Spreadsheet--ParseXLSX--Cell \
perl-Spreadsheet--ParseXLSX--Decryptor \
perl-Spreadsheet--ParseXLSX--Decryptor--Agile \
perl-Spreadsheet--ParseXLSX--Decryptor--Standard \
perl-Spreadsheet--ParseXLSX--Worksheet \
perl-Spreadsheet-ParseXLSX"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Archive--Zip \
perl-Crypt--Mode--CBC \
perl-Crypt--Mode--ECB \
perl-Digest--SHA \
perl-Graphics--ColorUtils \
perl-OLE--Storage-Lite \
perl-Spreadsheet--ParseExcel \
perl-Spreadsheet--ParseExcel--Cell \
perl-Spreadsheet--ParseExcel--Worksheet \
perl-XML--Twig"

inherit rpm
