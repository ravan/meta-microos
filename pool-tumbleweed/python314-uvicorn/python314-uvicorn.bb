SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.51.0"

RPM_NAME = "python314-uvicorn-0.51.0-1.1.noarch.rpm"
RPM_HASH = "f16871bbb87f2258696ab5f175a086eeede4d2cc6b6e722f3bcb1b9c1581efe12e680ce77618cfbec0f25547d925a7492e8dad9180d96a95427b74c3cd469b93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uvicorn \
python314-uvicorn \
python3dist-uvicorn"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click \
python314-h11"

inherit rpm
