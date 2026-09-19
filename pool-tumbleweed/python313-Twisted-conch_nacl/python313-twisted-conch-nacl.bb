SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python313-Twisted-conch_nacl-26.4.0-3.3.noarch.rpm"
RPM_HASH = "530c66c315dfe73e12f9c27e7d9f0c9bdaa83dd8c21279ab680c23a6e81d56d3c4e980fd20cadabed26bc78275cb9d88082ae2e0f26336b6fb0e01416714062b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-conch-nacl \
python313-Twisted-conch-nacl"

RDEPENDS:${PN} += "python313-Twisted-conch"

inherit rpm
