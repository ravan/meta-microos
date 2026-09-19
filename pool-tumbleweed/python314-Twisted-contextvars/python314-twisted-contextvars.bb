SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python314-Twisted-contextvars-26.4.0-3.3.noarch.rpm"
RPM_HASH = "5fecce39ec01a0649a108e585d6d60f26bb01ce376becd898c2b4939820fd6be75069d34a296054de7103e689ac4549d3b16c03461d959be11425b01635f301b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-Twisted-contextvars"

RDEPENDS:${PN} += "python314-Twisted"

inherit rpm
