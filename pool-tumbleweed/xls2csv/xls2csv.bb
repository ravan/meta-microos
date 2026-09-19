SUMMARY = "A script that recodes a spreadsheet's charset and saves as CSV"
DESCRIPTION = "This script will recode a spreadsheet into a different character set and output the recoded data as a csv file. \
The script came about after many headaches from dealing with Excel spreadsheets from clients that were being received in various character sets."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.07"

RPM_NAME = "xls2csv-1.07-1.30.noarch.rpm"
RPM_HASH = "70c2d60e56d249afac979a5c3e1b681c84cc9ba304a9a3b3aa81a27b6a0f299738071361701e4ab6f110f2bfc593b3e5aa80d5d4cdd840f3d2a9ea2c1475ace2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xls2csv"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Locale--Recode \
perl-Spreadsheet--ParseExcel \
perl-Spreadsheet--ParseExcel--FmtUnicode \
perl-Text--CSV-XS \
perl-Unicode--Map"

inherit rpm
