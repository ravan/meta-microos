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

RPM_NAME = "python313-gspread-6.2.1-1.4.noarch.rpm"
RPM_HASH = "19927a5aead4e724927b7480865fb7f5e57bc4df06c9df06c71b11508e6a439919e7972ef40744f3c8fb1556ddffa75aab1a4f77ef74fecbe98d7c2ab532c89a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gspread \
python3.13dist-gspread \
python313-gspread \
python3dist-gspread"

RDEPENDS:${PN} += "python-abi \
python313-StrEnum \
python313-google-auth \
python313-google-auth-oauthlib"

inherit rpm
