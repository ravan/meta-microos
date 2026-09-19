SUMMARY = "WWW Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the a plugin for Remmina which allows to login and \
to browse a page."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-plugin-www-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "2553298d304173866ed66910e6f719c569c764e326dcbcea6259349337f86d61160ec537ba45bd809ccc1b27bda1c06029b232ec522bccd6602938ebb9fe16b5"

RPROVIDES:${PN} += "remmina-plugin-www"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwebkit2gtk-4.1.so.0 \
remmina"

inherit rpm
