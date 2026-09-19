SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python313-Twisted-http2-26.4.0-3.3.noarch.rpm"
RPM_HASH = "918b78529a9ed8ee8cddd1812677a4456f6d966249d35d6591d0817646e1cc6c206ca0799869b1f944c70173933c2048e6652f872d80758e42b0d76c793c7ff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-http2 \
python313-Twisted-http2"

RDEPENDS:${PN} += "python313-Twisted \
python313-h2 \
python313-priority"

inherit rpm
