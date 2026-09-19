SUMMARY = "XMPP library by Gajim team"
DESCRIPTION = "Python-nbxmpp is a Python library that provides a way for Python \
applications to use Jabber/XMPP networks in a non-blocking way. \
This library is initialy a fork of xmpppy one, but using \
non-blocking sockets."
LICENSE = "GPL-3.0-or-later"

PV = "7.2.0"

RPM_NAME = "python314-nbxmpp-7.2.0-1.2.noarch.rpm"
RPM_HASH = "e60aadddbde7cdba5f496b928adf031e44e4a84911884060e8e1d9cca3d2ab345cc94e4e372404b86e7826bd0e8ec07c4e86a2459c3a167d0dba20958d1321b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nbxmpp \
python314-nbxmpp \
python3dist-nbxmpp"

RDEPENDS:${PN} += "python-abi \
python314-gobject \
python314-idna \
python314-packaging \
python314-precis-i18n"

inherit rpm
