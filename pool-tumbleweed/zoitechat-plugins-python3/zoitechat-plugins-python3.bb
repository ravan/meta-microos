SUMMARY = "Plugin for ZoiteChat adds support for Python3 scripts"
DESCRIPTION = "The ZoiteChat plugin providing the Python 3 scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.19.0"

RPM_NAME = "zoitechat-plugins-python3-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "7fea3a375b05aaeaa17b1768ded26c4c34c32546e04d60ae228dc8979b3af050afdc821670349664117f650946e40c1df7c48136ca91e15a0bc9ba539c6f7936"

RPROVIDES:${PN} += "plugins-python \
zoitechat-plugins-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
python3-cffi"

inherit rpm
