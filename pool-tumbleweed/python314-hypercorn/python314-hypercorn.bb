SUMMARY = "A ASGI Server based on Hyper libraries and inspired by Gunicorn"
DESCRIPTION = "Hypercorn is an `ASGI and WSGI web server based on the sans-io hyper, h11, h2, \
and wsproto libraries and inspired by Gunicorn. Hypercorn supports HTTP/1, \
HTTP/2, WebSockets (over HTTP/1 and HTTP/2), ASGI, and WSGI specifications. \
Hypercorn can utilise asyncio, uvloop, or trio worker types."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python314-hypercorn-0.18.0-3.1.noarch.rpm"
RPM_HASH = "520f5fba09ebc1347ba0d7d540010687d1f9fad07a2918d9f9167e8f781c47d3086be7a4189384caf6a5b6488b5ed314eb50137370579a3952cac5495395c475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hypercorn \
python314-hypercorn \
python3dist-hypercorn"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-h11 \
python314-h2 \
python314-priority \
python314-wsproto"

inherit rpm
