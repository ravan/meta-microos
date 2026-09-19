SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python314-Twisted-tls-26.4.0-3.3.noarch.rpm"
RPM_HASH = "0f3cb95cdb24036cab741b2070745c908be3d20a5454a5c30012238ddf2b5c159bf9ff1f500d33156b4d493d590853cee3917bd6a6619a024963babd987332bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-Twisted-tls"

RDEPENDS:${PN} += "python314-Twisted \
python314-idna \
python314-pyOpenSSL \
python314-service-identity"

inherit rpm
