SUMMARY = "WireGuard interface for mitmproxy"
DESCRIPTION = "Transparently proxy any device that can be configured as a WireGuard client!"
LICENSE = "MIT"

PV = "0.1.23"

RPM_NAME = "python314-mitmproxy-wireguard-0.1.23-3.13.aarch64.rpm"
RPM_HASH = "27f38980fac1983e5293c108dabfdf7710d31c187140671e8d00878efe68ea28ebf18655e0efde039c9445840a07374f86ed9b666b683954cccdd6c9b841e281"

RPROVIDES:${PN} += "python3.14dist-mitmproxy-wireguard \
python314-mitmproxy-wireguard \
python3dist-mitmproxy-wireguard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314"

inherit rpm
