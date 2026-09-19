SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python314-Twisted-http2-26.4.0-3.3.noarch.rpm"
RPM_HASH = "915f75df941ae0f03e5fa47f7f06c98cd5cfb165ae85cbb5f26ebd3875f2a00d19d4137c7f9dadecb2155ad8c7b067231247070035260be63ebf7fc38994c847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-Twisted-http2"

RDEPENDS:${PN} += "python314-Twisted \
python314-h2 \
python314-priority"

inherit rpm
