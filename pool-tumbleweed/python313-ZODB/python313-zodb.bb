SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "The Zope Object Database provides an object-oriented database for Python that \
provides a high-degree of transparency. Applications can take advantage of \
object database features with few, if any, changes to application logic. ZODB \
includes features such as a plugable storage interface, rich transaction \
support, and undo."
LICENSE = "ZPL-2.1"

PV = "6.3"

RPM_NAME = "python313-ZODB-6.3-1.2.noarch.rpm"
RPM_HASH = "b9de02fa02113bedc7bce301ffeb95a72b82ec4b286e1d89f416ad9f9af55e7e220946245e2850da9d0dbace15dda9ecacc0fc737240269bc2f374eab3663768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ZODB \
python3.13dist-zodb \
python313-ZODB \
python3dist-zodb"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-BTrees \
python313-ZConfig \
python313-persistent \
python313-transaction \
python313-zc.lockfile \
python313-zodbpickle \
python313-zope.interface"

inherit rpm
