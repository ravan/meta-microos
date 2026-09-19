SUMMARY = "Python XMPP (Jabber) Library that Implements Everything as a Plugin"
DESCRIPTION = "Slixmpp is an XMPP library for Python. Based on SleekXMPP, it uses \
asyncio instead of threads. XEP (XMPP Extended Protocol) coverage is \
realized as plugins."
LICENSE = "MIT & MPL-2.0"

PV = "1.16.0"

RPM_NAME = "python314-slixmpp-1.16.0-2.2.aarch64.rpm"
RPM_HASH = "a7fcdc7d50c0bc85e67239af3e10fd3eb51ec72cfe40398d98acdf730ae75409f6520e4e6eb4b22bb8375e69fa9685609ab7d7d0b53aac82471c63ba59ba2aa8"

RPROVIDES:${PN} += "python3.14dist-slixmpp \
python314-slixmpp \
python3dist-slixmpp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-aiodns \
python314-pyasn1 \
python314-pyasn1-modules"

inherit rpm
