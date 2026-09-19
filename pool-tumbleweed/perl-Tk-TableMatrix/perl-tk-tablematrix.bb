SUMMARY = "Table/Matrix Widget Extension to perl/tk"
DESCRIPTION = "Tk::TableMatrix is a table/matrix widget extension to perl/tk \
for displaying data in a table (or spreadsheet) format."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & TCL"

PV = "1.29"

RPM_NAME = "perl-Tk-TableMatrix-1.29-2.20.aarch64.rpm"
RPM_HASH = "fd710c2f487307d28ca45c37b7b645f1185f992c45c22cdb7a76ce3378877841cbb286114ec0c64177512f6426b569d0fcc1219dbeaef3ebe27e7262636051b7"

RPROVIDES:${PN} += "perl-Tk--TableMatrix \
perl-Tk--TableMatrix--Spreadsheet \
perl-Tk--TableMatrix--SpreadsheetHideRows \
perl-Tk-TableMatrix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Tk"

inherit rpm
