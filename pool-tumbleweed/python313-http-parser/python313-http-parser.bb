SUMMARY = "HTTP Request/Response Parser for Python in C"
DESCRIPTION = "HTTP request/response parser for Python in C, based on \
http-parser from Ryan Dahl."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-http-parser-0.9.0-3.11.aarch64.rpm"
RPM_HASH = "1bf46230cc2ab5b1c6bb67bf10ef164d88d3a9e0318536157d2abe807895dae7f12ad365d4afefcc6b6f28aa67fd8d69b6e082761aaeb944f2575abd0ac96248"

RPROVIDES:${PN} += "python3-http-parser \
python3.13dist-http-parser \
python313-http-parser \
python3dist-http-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
