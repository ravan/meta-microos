SUMMARY = "A bespoke and simple Todo.txt client"
DESCRIPTION = "Write a to-do list that will be easy to sync with most known Todo.txt clients."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "yishu-1.2.5-2.9.aarch64.rpm"
RPM_HASH = "7b8f2110f7105af358b25f1b4c449e0ce76c049f8a8c935d74a67d2f2408a6708356092d846793415fa0114a68e193701f8d03b41007361693a5fae237261a31"

RPROVIDES:${PN} += "yishu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
