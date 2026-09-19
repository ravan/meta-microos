SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python313-Twisted-26.4.0-3.3.noarch.rpm"
RPM_HASH = "44b79ba05f270dc8668a173a86e3ec6745e089ebe6b75049e3efccad9b285a78e39f85305748c6fd337e0a3c2e0a562fa1c2aafbad09dbe0ed12fc148ff4c479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted \
python3.13dist-twisted \
python313-Twisted \
python3dist-twisted"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Automat \
python313-Twisted-tls \
python313-attrs \
python313-constantly \
python313-hyperlink \
python313-incremental \
python313-typing-extensions \
python313-zope.interface"

inherit rpm
