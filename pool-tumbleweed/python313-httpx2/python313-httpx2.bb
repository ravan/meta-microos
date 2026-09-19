SUMMARY = "The next generation HTTP client"
DESCRIPTION = "HTTPX2 is a fully featured HTTP client library for Python 3. It includes an \
integrated command line client, has support for both HTTP/1.1 and HTTP/2, \
and provides both sync and async APIs. \
 \
HTTPX2 is a continuation of the wonderful work started by \
[lovelydinosaur](https://github.com/lovelydinosaur) and the broader HTTPX \
community."
LICENSE = "BSD-3-Clause"

PV = "2.12.0"

RPM_NAME = "python313-httpx2-2.12.0-1.1.noarch.rpm"
RPM_HASH = "20a51f1d12497465983a5ace4d21c110521e5a86d3990e3250961678f0c20c7b6acbe7e06fc5c8ff34e204131e4679127207e9ba3d048c8269ef26cbfd141f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpx2 \
python3.13dist-httpx2 \
python313-httpx2 \
python3dist-httpx2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-anyio \
python313-httpcore2 \
python313-idna \
python313-truststore"

inherit rpm
