SUMMARY = "Read information from an Excel file"
DESCRIPTION = "The Spreadsheet::ParseExcel module can be used to read information from \
Excel 95-2003 binary files. \
 \
The module cannot read files in the Excel 2007 Open XML XLSX format. See \
the Spreadsheet::XLSX module instead."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.660.0"

RPM_NAME = "perl-Spreadsheet-ParseExcel-0.660.0-2.12.noarch.rpm"
RPM_HASH = "0479856572655144ce4c64a423351e071014a374e9bd2284b10e29b55e5e1f96063d674905a57ad04341dbb64f88f06388d44513aaeda71738f05a3e2794c03c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--ParseExcel \
perl-Spreadsheet--ParseExcel--Cell \
perl-Spreadsheet--ParseExcel--Dump \
perl-Spreadsheet--ParseExcel--FmtDefault \
perl-Spreadsheet--ParseExcel--FmtJapan \
perl-Spreadsheet--ParseExcel--FmtJapan2 \
perl-Spreadsheet--ParseExcel--FmtUnicode \
perl-Spreadsheet--ParseExcel--Font \
perl-Spreadsheet--ParseExcel--Format \
perl-Spreadsheet--ParseExcel--SaveParser \
perl-Spreadsheet--ParseExcel--SaveParser--Workbook \
perl-Spreadsheet--ParseExcel--SaveParser--Worksheet \
perl-Spreadsheet--ParseExcel--Utility \
perl-Spreadsheet--ParseExcel--Workbook \
perl-Spreadsheet--ParseExcel--Worksheet \
perl-Spreadsheet-ParseExcel"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Crypt--RC4 \
perl-Digest--Perl--MD5 \
perl-IO--Scalar \
perl-OLE--Storage-Lite"

inherit rpm
