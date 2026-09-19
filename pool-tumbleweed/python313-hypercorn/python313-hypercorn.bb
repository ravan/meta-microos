SUMMARY = "A ASGI Server based on Hyper libraries and inspired by Gunicorn"
DESCRIPTION = "Hypercorn is an `ASGI and WSGI web server based on the sans-io hyper, h11, h2, \
and wsproto libraries and inspired by Gunicorn. Hypercorn supports HTTP/1, \
HTTP/2, WebSockets (over HTTP/1 and HTTP/2), ASGI, and WSGI specifications. \
Hypercorn can utilise asyncio, uvloop, or trio worker types."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python313-hypercorn-0.18.0-3.1.noarch.rpm"
RPM_HASH = "e38572f4cfb719ede38ad4ee417ff898428033d3cb6f65e67fb72ffb332370020ec958355523b48431a876e6cf50bf5b1bcfd9f3aa01f9144091bc617c0b0795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypercorn \
python3.13dist-hypercorn \
python313-hypercorn \
python3dist-hypercorn"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-h11 \
python313-h2 \
python313-priority \
python313-wsproto"

inherit rpm
