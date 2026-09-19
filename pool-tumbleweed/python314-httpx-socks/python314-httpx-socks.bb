SUMMARY = "Proxy (HTTP, SOCKS) transports for httpx"
DESCRIPTION = "Proxy (HTTP, SOCKS) transports for httpx"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python314-httpx-socks-0.13.1-1.1.noarch.rpm"
RPM_HASH = "4fe7a3db89f4a99ec4a9df24c5a5249a6361f92c8b7aed07c701e086db42852943136a148a7627b609bf475d2a1d54b029f62471cec3a0288cacfd237e93116c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpx-socks \
python314-httpx-socks \
python3dist-httpx-socks"

RDEPENDS:${PN} += "python-abi \
python314-httpcore \
python314-httpx \
python314-python-socks \
python314-sniffio"

inherit rpm
