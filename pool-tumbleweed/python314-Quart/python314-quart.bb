SUMMARY = "A Python ASGI web microframework with the same API as Flask"
DESCRIPTION = "Quart is an async Python web microframework. Using Quart you can, \
 \
* render and serve HTML templates, \
* write (RESTful) JSON APIs, \
* serve WebSockets, \
* stream request and response data, \
* do pretty much anything over the HTTP or WebSocket protocols."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python314-Quart-0.20.0-5.2.noarch.rpm"
RPM_HASH = "7a3e7166b9b3278811b33d42c9497f8bbc3bc61868f975aafc3e04d6462d75c101bf51cf8673ade9a2972f5c0aec6ecf0f432775e18f28566e760ca88830d2e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-quart \
python314-Quart \
python3dist-quart"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Flask \
python314-Jinja2 \
python314-MarkupSafe \
python314-Werkzeug \
python314-aiofiles \
python314-blinker \
python314-click \
python314-hypercorn \
python314-itsdangerous"

inherit rpm
