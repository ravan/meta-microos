SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python313-aiohttp_cors-0.8.1-1.5.noarch.rpm"
RPM_HASH = "260eb9e80c74893455794bc3b25b47047f46bb63f5ea228fd2773d483f1fd274c40b71a767507a2ece0644a65cccb5ef79a3e43515b0894627cd3f9f1d5b91c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-cors \
python3.13dist-aiohttp-cors \
python313-aiohttp-cors \
python3dist-aiohttp-cors"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp"

inherit rpm
