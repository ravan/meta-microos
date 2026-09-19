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

RPM_NAME = "python313-Quart-0.20.0-5.2.noarch.rpm"
RPM_HASH = "ab216377a2fbaff7d22c09c0f566f168efc011ad4d60bae1885718fdbc31923ae0f83cae3949bd07418967e615ddcb017202c806197a5c3e0af3121672410f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Quart \
python3.13dist-quart \
python313-Quart \
python3dist-quart"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Flask \
python313-Jinja2 \
python313-MarkupSafe \
python313-Werkzeug \
python313-aiofiles \
python313-blinker \
python313-click \
python313-hypercorn \
python313-itsdangerous"

inherit rpm
