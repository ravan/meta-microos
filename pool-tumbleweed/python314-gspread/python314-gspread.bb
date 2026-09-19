SUMMARY = "Google Spreadsheets Python API"
DESCRIPTION = "A Python module to access Google Spreadsheets. \
 \
Features \
-------- \
 \
* Google Sheets API v4. \
* Open a spreadsheet by its *title*, *url* or *key*. \
* Select cells by labels, e.g. 'A1'. \
* Extract range, entire row or column values. \
* Python 3 support."
LICENSE = "MIT"

PV = "6.2.1"

RPM_NAME = "python314-gspread-6.2.1-1.4.noarch.rpm"
RPM_HASH = "38f95415a09a61a5b9f21257467604266e6e529a825d64ac39dee82b348d3b2f232b728823d2d3f6dfa750cbb19f1f3f2c86717f3a8a75b17b915adf1f7dff56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gspread \
python314-gspread \
python3dist-gspread"

RDEPENDS:${PN} += "python-abi \
python314-StrEnum \
python314-google-auth \
python314-google-auth-oauthlib"

inherit rpm
