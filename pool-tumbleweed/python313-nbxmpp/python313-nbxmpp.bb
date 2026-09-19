SUMMARY = "XMPP library by Gajim team"
DESCRIPTION = "Python-nbxmpp is a Python library that provides a way for Python \
applications to use Jabber/XMPP networks in a non-blocking way. \
This library is initialy a fork of xmpppy one, but using \
non-blocking sockets."
LICENSE = "GPL-3.0-or-later"

PV = "7.2.0"

RPM_NAME = "python313-nbxmpp-7.2.0-1.2.noarch.rpm"
RPM_HASH = "1c109e74627f4cf5052e5cdff416c27c7792b7291c97798cf46593d13300a0177def926b809df6aff88cde6514d43301e9a86ed9692d4b00dbb4951f7bd668a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nbxmpp \
python3.13dist-nbxmpp \
python313-nbxmpp \
python3dist-nbxmpp"

RDEPENDS:${PN} += "python-abi \
python313-gobject \
python313-idna \
python313-packaging \
python313-precis-i18n"

inherit rpm
