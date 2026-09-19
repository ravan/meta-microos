SUMMARY = "HTTP client that can impersonate web browsers"
DESCRIPTION = "The fastest python HTTP client that can impersonate web browsers, mimicking \
their headers and 'TLS/JA3/JA4/HTTP2' fingerprints"
LICENSE = "Apache-2.0 & MIT"

PV = "1.2.3"

RPM_NAME = "python314-primp-1.2.3-1.4.aarch64.rpm"
RPM_HASH = "8fdfe3672fea5f9dede8d789b9f1199471634dee031a9c74b3886500f129d6dc469ebc5cf358c15e3e7ef80813e0fb4ddcfe41f23409edf41a93bcbbfa38161d"

RPROVIDES:${PN} += "python3.14dist-primp \
python314-primp \
python3dist-primp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
