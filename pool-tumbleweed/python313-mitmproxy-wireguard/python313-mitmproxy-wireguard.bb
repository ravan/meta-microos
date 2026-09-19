SUMMARY = "WireGuard interface for mitmproxy"
DESCRIPTION = "Transparently proxy any device that can be configured as a WireGuard client!"
LICENSE = "MIT"

PV = "0.1.23"

RPM_NAME = "python313-mitmproxy-wireguard-0.1.23-3.13.aarch64.rpm"
RPM_HASH = "0a0167a14c21d856163539aee5081574b8494d86870349f2bee39b1691bfdd6ed1db4eec0c4bd296681850d2780f3f0f3ad3d5d4e537a930d100a55e0488fa2d"

RPROVIDES:${PN} += "python3-mitmproxy-wireguard \
python3.13dist-mitmproxy-wireguard \
python313-mitmproxy-wireguard \
python3dist-mitmproxy-wireguard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313"

inherit rpm
