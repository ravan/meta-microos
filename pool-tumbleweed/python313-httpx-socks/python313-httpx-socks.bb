SUMMARY = "Proxy (HTTP, SOCKS) transports for httpx"
DESCRIPTION = "Proxy (HTTP, SOCKS) transports for httpx"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python313-httpx-socks-0.13.1-1.1.noarch.rpm"
RPM_HASH = "392e61e4e029b11db54bc0a719214c381c5631546398a70c6221409eac79b1c17be60945d8b59f195e4aaf8c37d5cfe7aa8c9963d488a02aaf0fc679190b940c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpx-socks \
python3.13dist-httpx-socks \
python313-httpx-socks \
python3dist-httpx-socks"

RDEPENDS:${PN} += "python-abi \
python313-httpcore \
python313-httpx \
python313-python-socks \
python313-sniffio"

inherit rpm
