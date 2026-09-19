SUMMARY = "Spreadsheet Application"
DESCRIPTION = "Gnumeric is a spreadsheet application with advanced features and \
analytics.  It aims to minimize the cost of transition from proprietary \
spreadsheets by offering a familiar look and feature set.  In addition \
to read and write support for all versions of Microsoft Excel \
(including reading encrypted files), there is also support for many \
other formats including: \
 \
*Applix 4 and 5 *DIF *Lotus-123 (wk1, wk2, wk3) *OpenOffice.org (Oasis) \
*PlanPerfect (pln) *Psion5 *Quattro Pro (wb1, wb2, wb3) *SYLK \
*XBase/DB3 \
 \
Text formats, such as comma or tab separated values, HTML, XHTML, and \
Latex, are supported and there are powerful assistants to handle custom \
needs. \
 \
Gnumeric is part of the GNOME project."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.12.61"

RPM_NAME = "gnumeric-1.12.61-1.3.aarch64.rpm"
RPM_HASH = "bc9d53f0b4468c48b33f97d8d79ae554571ac5bf6574b3da92b3f98aa3bf943011071846a9d76a4ef4fbd0249957d12c1b89aed025979c5e76660b9d9d1ddd4c"

RPROVIDES:${PN} += "gnumeric \
gnumeric2 \
libspreadsheet-1.12.61.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgda-6.0.so.6.0.0 \
libgda-ui-6.0.so.6.0.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgoffice-0.10.so.10 \
libgsf-1.so.114 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libperl.so \
libxml2.so.16 \
libz.so.1 \
perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
