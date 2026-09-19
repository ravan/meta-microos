SUMMARY = "Plugin for HexChat adds support for Python3 scripts"
DESCRIPTION = "The HexChat plugin providing the Python 3 scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.2"

RPM_NAME = "hexchat-plugins-python3-2.16.2-4.1.aarch64.rpm"
RPM_HASH = "1b2cd8c1a49af06484f6b769d7e11c696dfa58419f7e8318da271a8bbad9e5f877923d591b70edd9b266bae92666cb551b104cbc53fb951fdc68a828ec75b44c"

RPROVIDES:${PN} += "hexchat-plugins-python3 \
plugins-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
python3-cffi"

inherit rpm
