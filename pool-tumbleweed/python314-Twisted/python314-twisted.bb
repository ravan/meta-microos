SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python314-Twisted-26.4.0-3.3.noarch.rpm"
RPM_HASH = "c9a4461d4c9722f514e66e0dc53752ac16e8359675e68671958cfa78a421a04b806cb6bbc7938b10574d777f60ba44cfe9ccb10fe3efd2ab2fef76724712373a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-twisted \
python314-Twisted \
python3dist-twisted"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Automat \
python314-Twisted-tls \
python314-attrs \
python314-constantly \
python314-hyperlink \
python314-incremental \
python314-typing-extensions \
python314-zope.interface"

inherit rpm
