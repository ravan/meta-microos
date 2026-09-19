SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python313-Twisted-tls-26.4.0-3.3.noarch.rpm"
RPM_HASH = "127deeaf25a238d3f75b766e6e5b75d6a9eeb4695a811733afc423e45a76ea41c203160fb47b40644a487fff4c14f918f1899d3987250e91886bcd86690bd977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-tls \
python313-Twisted-tls"

RDEPENDS:${PN} += "python313-Twisted \
python313-idna \
python313-pyOpenSSL \
python313-service-identity"

inherit rpm
