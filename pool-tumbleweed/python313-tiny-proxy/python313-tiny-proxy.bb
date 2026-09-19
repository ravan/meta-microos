SUMMARY = "Simple proxy server (SOCKS4(a), SOCKS5(h), HTTP tunnel)"
DESCRIPTION = "Simple proxy server (SOCKS4(a), SOCKS5(h), HTTP tunnel)"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python313-tiny-proxy-0.3.0-1.1.noarch.rpm"
RPM_HASH = "5fcb30fd615e1bf753217c211b8cd9f7e696320297abbe3bc3a564e5ee6992cd6964f94302e92c4c42fcbb6839a377f7fe050c82f12cb61bb800ca850f74b604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tiny-proxy \
python3.13dist-tiny-proxy \
python313-tiny-proxy \
python3dist-tiny-proxy"

RDEPENDS:${PN} += "python-abi \
python313-anyio"

inherit rpm
