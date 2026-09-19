SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.51.0"

RPM_NAME = "python313-uvicorn-0.51.0-1.1.noarch.rpm"
RPM_HASH = "4150f1fe44281c3e1739a1fe487c975cfd7fd3425994013a43f183042610bb8bd7c35f26806a75c6ad3ae93cf3789ef6f705c5d9f78bfd92b97ba0bc6af7c763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uvicorn \
python3.13dist-uvicorn \
python313-uvicorn \
python3dist-uvicorn"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click \
python313-h11"

inherit rpm
