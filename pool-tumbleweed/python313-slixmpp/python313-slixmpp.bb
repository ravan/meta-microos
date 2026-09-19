SUMMARY = "Python XMPP (Jabber) Library that Implements Everything as a Plugin"
DESCRIPTION = "Slixmpp is an XMPP library for Python. Based on SleekXMPP, it uses \
asyncio instead of threads. XEP (XMPP Extended Protocol) coverage is \
realized as plugins."
LICENSE = "MIT & MPL-2.0"

PV = "1.16.0"

RPM_NAME = "python313-slixmpp-1.16.0-2.2.aarch64.rpm"
RPM_HASH = "76838f94fcbab34f8581816112d598dad7f33ae5729ec52f528f38caf413b824faf6d8c63f5067b1ee53759cdc967feb0f1bbb42df5061e3cc333609150753fc"

RPROVIDES:${PN} += "python3-slixmpp \
python3.13dist-slixmpp \
python313-slixmpp \
python3dist-slixmpp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-aiodns \
python313-pyasn1 \
python313-pyasn1-modules"

inherit rpm
