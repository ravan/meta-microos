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

RPM_NAME = "python314-httpx2-2.12.0-1.1.noarch.rpm"
RPM_HASH = "c954139c2a17a153e5d7999d0e08118ef284a1d98c7980b8a716d45357e4aab4c5fa4710eadc958bcab30163bfea9a0957ed3ccab8306b9c8dc8862492d37cb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpx2 \
python314-httpx2 \
python3dist-httpx2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-anyio \
python314-httpcore2 \
python314-idna \
python314-truststore"

inherit rpm
