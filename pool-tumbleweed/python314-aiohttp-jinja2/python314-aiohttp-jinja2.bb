SUMMARY = "Jinja2 template renderer for aiohttp.web"
DESCRIPTION = "Jinja2 template renderer for aiohttp.web."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python314-aiohttp-jinja2-1.6-3.2.noarch.rpm"
RPM_HASH = "c0fd0e1997ecab7a60a830c445b08fea9968320d970b31e4bf832c40adb8639f057e0ad5eedd7b295be39164fbaef78c29bf948c40ac229c8dde1a67c22827ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiohttp-jinja2 \
python314-aiohttp-jinja2 \
python3dist-aiohttp-jinja2"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-aiohttp"

inherit rpm
