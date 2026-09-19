SUMMARY = "Perl extension for reading MS Excel 2007 files"
DESCRIPTION = "This module is a (quick and dirty) emulation of Spreadsheet::ParseExcel for \
Excel 2007 (.xlsx) file format. It supports styles and many of Excel's \
quirks, but not all. It populates the classes from Spreadsheet::ParseExcel \
for interoperability; including Workbook, Worksheet, and Cell."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.180.0"

RPM_NAME = "perl-Spreadsheet-XLSX-0.180.0-1.12.noarch.rpm"
RPM_HASH = "ac87fbff65c1d8362e1cc5555edb97c0c6c6558706d8fde471fc9edcfc204a9564a441b4f25fd13f9c3920a687c9f0f62fc0ba9a91686a6c61f10618fdd83151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--XLSX \
perl-Spreadsheet--XLSX--Fmt2007 \
perl-Spreadsheet--XLSX--Utility2007 \
perl-Spreadsheet-XLSX"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Archive--Zip \
perl-Spreadsheet--ParseExcel"

inherit rpm
