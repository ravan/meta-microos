SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "The Zope Object Database provides an object-oriented database for Python that \
provides a high-degree of transparency. Applications can take advantage of \
object database features with few, if any, changes to application logic. ZODB \
includes features such as a plugable storage interface, rich transaction \
support, and undo."
LICENSE = "ZPL-2.1"

PV = "6.3"

RPM_NAME = "python314-ZODB-6.3-1.2.noarch.rpm"
RPM_HASH = "70d20959ce642bf1609463c68dec8014df6e0cfb5769af4f92e58cb29142f3ea5ccecc64f96e45bee9b6d208c8dad243ea344e5edd838af2833a8b3199e1d3e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zodb \
python314-ZODB \
python3dist-zodb"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-BTrees \
python314-ZConfig \
python314-persistent \
python314-transaction \
python314-zc.lockfile \
python314-zodbpickle \
python314-zope.interface"

inherit rpm
