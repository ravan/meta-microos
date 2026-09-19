SUMMARY = "Python library for receiving certificate transparency list updates"
DESCRIPTION = "Certstream is a library to connect to the certstream network (certstream.calidog.io). \
 \
It supports automatic reconnection when networks issues occur, and should be stable for long-running jobs."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "python313-certstream-1.12-3.5.noarch.rpm"
RPM_HASH = "375bfb3f6452119557f83ad6c8cda777d226bfd2e9ebb8757c5fdc22f4283ce20bbd0480917d9b01e43f45efcb679652f0a1814c0c93bc1f93edc2b7f50a9bd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certstream \
python3.13dist-certstream \
python313-certstream \
python3dist-certstream"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python3-termcolor \
python3-websocket-client"

inherit rpm
