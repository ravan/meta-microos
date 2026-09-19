SUMMARY = "Client-Server storage implementation for ZODB"
DESCRIPTION = "ZEO provides a client-server storage implementation for ZODB."
LICENSE = "ZPL-2.1"

PV = "6.2"

RPM_NAME = "python313-ZEO-6.2-1.2.noarch.rpm"
RPM_HASH = "b37d9ffc70065482f2dc79f1da1b479b80951ebc3aa9b9deb9bd2d5dd7cbd033c9063051746841e2070e3dab657ab64ab0f0dc1a32114f9a92f723f6bc05e65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ZEO \
python3.13dist-zeo \
python313-ZEO \
python3dist-zeo"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-ZConfig \
python313-ZODB \
python313-persistent \
python313-transaction \
python313-zc.lockfile \
python313-zdaemon \
python313-zope.interface \
update-alternatives"

inherit rpm
