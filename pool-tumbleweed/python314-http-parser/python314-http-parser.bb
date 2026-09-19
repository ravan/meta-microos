SUMMARY = "HTTP Request/Response Parser for Python in C"
DESCRIPTION = "HTTP request/response parser for Python in C, based on \
http-parser from Ryan Dahl."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-http-parser-0.9.0-3.11.aarch64.rpm"
RPM_HASH = "bd92acbe8ed72c7babddb7eb8ec294b83a8fbf8b13710e24f15804bf227245acc540f6d01751791626517bd71ab0815dd5ea64c21863c9f976ca2e2254b21004"

RPROVIDES:${PN} += "python3.14dist-http-parser \
python314-http-parser \
python3dist-http-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
