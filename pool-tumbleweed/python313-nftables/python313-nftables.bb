SUMMARY = "Python bindings for nftables"
DESCRIPTION = "Python bindings for nftables"
LICENSE = "GPL-2.0-only"

PV = "1.1.7"

RPM_NAME = "python313-nftables-1.1.7-1.1.noarch.rpm"
RPM_HASH = "e5f4317fd4445757fb94efb1f28fea705227317f02f6d95eeab69735d5210c7d502d8b498e2582497f37f1b2a41cd65504c152973ec615ccbbc6d87321b46bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nftables \
python3.13dist-nftables \
python313-nftables \
python3dist-nftables"

RDEPENDS:${PN} += "libnftables1 \
python-abi"

inherit rpm
