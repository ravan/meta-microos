SUMMARY = "Meta-Wrapper for reading spreadsheet data"
DESCRIPTION = "Spreadsheet::Read tries to transparently read *any* spreadsheet and return \
its content in a universal manner independent of the parsing module that \
does the actual spreadsheet scanning. \
 \
For OpenOffice this module uses Spreadsheet::ReadSXC \
 \
For Microsoft Excel this module uses Spreadsheet::ParseExcel or \
Spreadsheet::XLSX \
 \
For CSV this module uses Text::CSV_XS (0.29 or up required, 0.73 or up \
preferred) or Text::CSV_PP (1.05 or up required). \
 \
For SquirrelCalc there is a very simplistic built-in parser"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.950.0"

RPM_NAME = "perl-Spreadsheet-Read-0.950.0-1.5.noarch.rpm"
RPM_HASH = "65feb69b16665e6852982bcda3bdc121f9fe0b88f1a3059bc48438b576085e8c2772f87811af79f013fafab3520cb31cd6a728bf1f598584e78bdf49a856ce27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--Read \
perl-Spreadsheet-Read"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--Peek \
perl-File--Temp \
perl-IO--Scalar \
perl-Test--More \
perl-Test--NoWarnings"

inherit rpm
