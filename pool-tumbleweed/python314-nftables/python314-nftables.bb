SUMMARY = "Python bindings for nftables"
DESCRIPTION = "Python bindings for nftables"
LICENSE = "GPL-2.0-only"

PV = "1.1.7"

RPM_NAME = "python314-nftables-1.1.7-1.1.noarch.rpm"
RPM_HASH = "de421d5767a9cee6b5e0bb5c96e17c92c12c02167de196b5350d452d63654440c440a3e049af8808af51239263d39ef1d837f42557e47c9175d77b01e43b5058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nftables \
python314-nftables \
python3dist-nftables"

RDEPENDS:${PN} += "libnftables1 \
python-abi"

inherit rpm
