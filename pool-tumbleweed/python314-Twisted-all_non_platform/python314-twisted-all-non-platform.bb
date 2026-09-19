SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python314-Twisted-all_non_platform-26.4.0-3.3.noarch.rpm"
RPM_HASH = "e48b694bc50f25dbf1cd021be7f0eb76c5e1cde770778bd290a21df731d841797c5915851d00fb880ad93323443a87910c90f6714ae2543b6df579c370a7e21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-Twisted-all-non-platform"

RDEPENDS:${PN} += "python314-PyHamcrest \
python314-Twisted-conch \
python314-Twisted-contextvars \
python314-Twisted-http2 \
python314-Twisted-serial \
python314-Twisted-tls"

inherit rpm
