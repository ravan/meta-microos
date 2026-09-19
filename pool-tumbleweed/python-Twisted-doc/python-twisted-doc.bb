SUMMARY = "An asynchronous networking framework written in Python - Documentation"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This package contains the documentation for python-Twisted"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python-Twisted-doc-26.4.0-3.3.noarch.rpm"
RPM_HASH = "4e8bf8dfc6702e30373f4041da8c0a224e78ad0a93e794d2c280c49729b4926161f45d4411ccff608c32980c03ee26783a6584145944790f0d9b9649f8efcb0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Twisted-doc"

RDEPENDS:${PN} += ""

inherit rpm
