SUMMARY = "Documentation files for Gnumeric"
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

RPM_NAME = "gnumeric-doc-1.12.61-1.3.noarch.rpm"
RPM_HASH = "d93229656fb85739008621f1f5779b421f9db58295eca80cc3294a7404ec8d8cd3aa6c336ba73303100a6ec41933c2bc05d7b7198b82b44f6fd889e3fe9a4ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnumeric-doc"

RDEPENDS:${PN} += "gnumeric"

inherit rpm
