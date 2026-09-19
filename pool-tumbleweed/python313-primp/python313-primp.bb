SUMMARY = "HTTP client that can impersonate web browsers"
DESCRIPTION = "The fastest python HTTP client that can impersonate web browsers, mimicking \
their headers and 'TLS/JA3/JA4/HTTP2' fingerprints"
LICENSE = "Apache-2.0 & MIT"

PV = "1.2.3"

RPM_NAME = "python313-primp-1.2.3-1.4.aarch64.rpm"
RPM_HASH = "b1b6c31a3eb7ffb0ba720112d03f4360faf836d7b852e48384a6479311c76f97b64eb52bcf1ecd9cfe6c414fe74ce71b9c25bfe06c0222b661e5ccc6e5397b36"

RPROVIDES:${PN} += "python3-primp \
python3.13dist-primp \
python313-primp \
python3dist-primp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
