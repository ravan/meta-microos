SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python314-aiohttp_cors-0.8.1-1.5.noarch.rpm"
RPM_HASH = "8feec4bb9db0e4e131f46be52fc7420efcd092134cce34acb461a8d946b4727d06ea501fde7ce64fe5a6bd3577705a5f7f634f8954748d01613c5217b6084d24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiohttp-cors \
python314-aiohttp-cors \
python3dist-aiohttp-cors"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp"

inherit rpm
