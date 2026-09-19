SUMMARY = "Simple proxy server (SOCKS4(a), SOCKS5(h), HTTP tunnel)"
DESCRIPTION = "Simple proxy server (SOCKS4(a), SOCKS5(h), HTTP tunnel)"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python314-tiny-proxy-0.3.0-1.1.noarch.rpm"
RPM_HASH = "d825e7dd14b5a7f740551d0734499caad01a615847a9a15e232ee1c55dbaddb5bfe1cc217b0cad659d69673494957f75c494bc83e13b5b0586ed01f8b8a9e2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tiny-proxy \
python314-tiny-proxy \
python3dist-tiny-proxy"

RDEPENDS:${PN} += "python-abi \
python314-anyio"

inherit rpm
