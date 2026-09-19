SUMMARY = "Convert WSGI app to ASGI app or ASGI app to WSGI app"
DESCRIPTION = "Convert WSGI app to ASGI app or ASGI app to WSGI app. \
 \
Pure Python. Only depend on the standard library. \
 \
Compared with other converters, the advantage is that a2wsgi will not accumulate the requested content or response content in the memory, so you don't have to worry about the memory limit caused by a2wsgi. This problem exists in converters implemented by uvicorn/startlette or hypercorn."
LICENSE = "Apache-2.0"

PV = "1.10.10"

RPM_NAME = "python313-a2wsgi-1.10.10-1.5.noarch.rpm"
RPM_HASH = "ef7713ec243f5b28f636eca733d4518100dfc9f124c35d795d26fc0898f44e04b64a9731a385fd42bd074ad0a705bb547aaa2ee34cf2a33e1bec5716c1b43f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-a2wsgi \
python3.13dist-a2wsgi \
python313-a2wsgi \
python3dist-a2wsgi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
