SUMMARY = "Client-Server storage implementation for ZODB"
DESCRIPTION = "ZEO provides a client-server storage implementation for ZODB."
LICENSE = "ZPL-2.1"

PV = "6.2"

RPM_NAME = "python314-ZEO-6.2-1.2.noarch.rpm"
RPM_HASH = "3d269eb210e64a350e47271394b3a71b17bc141c94a7d9b95d5fc1379edcfe6139479404316ed76ac2121a506cf99a77fd5ccb9a05d8ecead857ba75c02619e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zeo \
python314-ZEO \
python3dist-zeo"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-ZConfig \
python314-ZODB \
python314-persistent \
python314-transaction \
python314-zc.lockfile \
python314-zdaemon \
python314-zope.interface \
update-alternatives"

inherit rpm
