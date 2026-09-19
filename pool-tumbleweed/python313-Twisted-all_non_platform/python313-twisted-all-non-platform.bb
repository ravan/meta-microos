SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python313-Twisted-all_non_platform-26.4.0-3.3.noarch.rpm"
RPM_HASH = "8a243a507ae82ac89cbe3b9154b0a862925a14744c42d3dc8af1ef99ee91a07fcafb18fa50031b21eee2ce3760a6ef22c17a0bbc54d59830ebc7a795275191f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-all-non-platform \
python313-Twisted-all-non-platform"

RDEPENDS:${PN} += "python313-PyHamcrest \
python313-Twisted-conch \
python313-Twisted-contextvars \
python313-Twisted-http2 \
python313-Twisted-serial \
python313-Twisted-tls"

inherit rpm
