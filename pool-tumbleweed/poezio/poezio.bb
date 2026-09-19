SUMMARY = "XMPP Client for the Console"
DESCRIPTION = "Poezio is a console-based client for XMPP, the protocol on which the \
Jabber IM network is built. The network can be conneced to without \
having to create an account and join various chatrooms immediately. \
The client tries to look similar to the weechat/irssi IRC clients and \
many commands are identical. Configuration can be done in a \
configuration file or directly from the client."
LICENSE = "MIT"

PV = "0.18"

RPM_NAME = "poezio-0.18-1.3.aarch64.rpm"
RPM_HASH = "5404a449d6704e350976559a523c7ee031b569649977e1ea36ca180001003ab65ca45aac4afbbce2c2f21f6c31920c5c03950c0ec009a6101c73685336e77b47"

RPROVIDES:${PN} += "poezio \
python3.13dist-poezio \
python3dist-poezio"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-aiodns \
python3-curses \
python3-pyasn1-modules \
python3-setuptools \
python3-slixmpp"

inherit rpm
