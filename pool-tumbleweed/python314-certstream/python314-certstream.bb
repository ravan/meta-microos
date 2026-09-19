SUMMARY = "Python library for receiving certificate transparency list updates"
DESCRIPTION = "Certstream is a library to connect to the certstream network (certstream.calidog.io). \
 \
It supports automatic reconnection when networks issues occur, and should be stable for long-running jobs."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "python314-certstream-1.12-3.5.noarch.rpm"
RPM_HASH = "9ef32b8332707ecada9d0d5097cb6490af334bed08357ec6530813e8c9a3477bee861e1257a07ebfbb3c8ab6ed05334868f3f1fb1ee94a3dbe17ad4941c520aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certstream \
python314-certstream \
python3dist-certstream"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python3-termcolor \
python3-websocket-client"

inherit rpm
