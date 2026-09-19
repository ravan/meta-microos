SUMMARY = "This Module can be Used to Create Excel Binary Files"
DESCRIPTION = "The Spreadsheet::WriteExcel module can be used to create a cross- \
platform Excel binary file. Multiple worksheets can be added to a \
workbook and formatting can be applied to cells. Text, numbers, \
formulas, hyperlinks, and images can be written to the cells. \
 \
The Excel file produced by this module is compatible with Excel 5, 95, \
97, 2000, and 2002. \
 \
The module will work on the majority of Windows, UNIX, and Macintosh \
platforms. Generated files are also compatible with Gnumeric and \
OpenOffice.org, the Linux/UNIX spreadsheet applications. The generated \
files are not compatible with MS Access."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.40"

RPM_NAME = "perl-Spreadsheet-WriteExcel-2.40-1.16.aarch64.rpm"
RPM_HASH = "08057c82b0c4c19c3bbaec3d87d3d6a069f501bc917e40ac3287bf8591d0d3e855fa65d8ec1c5361e5afd21f07d97a67613cbbdc61d0cb7135b5632d8dda1756"

RPROVIDES:${PN} += "perl-Spreadsheet--WriteExcel \
perl-Spreadsheet--WriteExcel--BIFFwriter \
perl-Spreadsheet--WriteExcel--Big \
perl-Spreadsheet--WriteExcel--Chart \
perl-Spreadsheet--WriteExcel--Chart--Area \
perl-Spreadsheet--WriteExcel--Chart--Bar \
perl-Spreadsheet--WriteExcel--Chart--Column \
perl-Spreadsheet--WriteExcel--Chart--External \
perl-Spreadsheet--WriteExcel--Chart--Line \
perl-Spreadsheet--WriteExcel--Chart--Pie \
perl-Spreadsheet--WriteExcel--Chart--Scatter \
perl-Spreadsheet--WriteExcel--Chart--Stock \
perl-Spreadsheet--WriteExcel--Examples \
perl-Spreadsheet--WriteExcel--Format \
perl-Spreadsheet--WriteExcel--Formula \
perl-Spreadsheet--WriteExcel--OLEwriter \
perl-Spreadsheet--WriteExcel--Properties \
perl-Spreadsheet--WriteExcel--Utility \
perl-Spreadsheet--WriteExcel--Workbook \
perl-Spreadsheet--WriteExcel--Worksheet \
perl-Spreadsheet-WriteExcel"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Parse--RecDescent"

inherit rpm
