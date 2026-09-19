SUMMARY = "Lua Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Lua language."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.1"

RPM_NAME = "weechat-lua-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "6ed7f75708088d5bb3e0d497d4c5d82587c96b078b0fe1d95d2a63a5e7d6b67c43542fa8c5a73234c04750664801798263712a61756f2ae24b46b22ac77191a7"

RPROVIDES:${PN} += "weechat-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
weechat"

inherit rpm
