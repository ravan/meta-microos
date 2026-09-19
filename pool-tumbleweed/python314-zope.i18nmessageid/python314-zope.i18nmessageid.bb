SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "8.2"

RPM_NAME = "python314-zope.i18nmessageid-8.2-1.4.aarch64.rpm"
RPM_HASH = "bbe446bf98bb6e6e8b26c1e6315dd36a4942194bf42ba7886fb922a6618afbf5b5cc52534c26936705d4dd580ebc7862455c65be45c8c58164bd86e58ada21d1"

RPROVIDES:${PN} += "python3.14dist-zope.i18nmessageid \
python314-zope.i18nmessageid \
python3dist-zope.i18nmessageid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
