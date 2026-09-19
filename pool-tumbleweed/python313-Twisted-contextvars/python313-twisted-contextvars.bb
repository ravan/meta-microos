SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python313-Twisted-contextvars-26.4.0-3.3.noarch.rpm"
RPM_HASH = "e38d5adfcf01e8869c619a0d329dc7402d0ba8cb8e6f12d7626c7181781c4e386871f58e682250afcfaf18894b09b63bebf82ec9d120131c9b9ce1060b4cfb0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-contextvars \
python313-Twisted-contextvars"

RDEPENDS:${PN} += "python313-Twisted"

inherit rpm
