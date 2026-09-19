SUMMARY = "A lightweight email reader for the Pantheon desktop"
DESCRIPTION = "Mail is a email reader for Pantheon designed to let you read your email \
quickly and effortlessly. \
 \
Its interface is based on conversations, so you can easily read an entire \
discussion without having to click from message to message."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.0"

RPM_NAME = "pantheon-mail-8.0.0-2.6.aarch64.rpm"
RPM_HASH = "60ceff51587cf1f457fea98ef80319421ffbee07562017c5db057b161a995073761d474967f10219ee9f9edbf270c2f4e7d79fcf2396ba703bca994c9562adc7"

RPROVIDES:${PN} += "elementary-mail \
libio.elementary.mail-webkit-extension.so \
pantheon-mail"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libedataserver-1.2.so.27 \
libedataserverui-1.2.so.4 \
libfolks.so.26 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libjavascriptcoregtk-4.1.so.0 \
libpango-1.0.so.0 \
libportal-gtk3.so.1 \
libportal.so.1 \
libwebkit2gtk-4.1.so.0"

inherit rpm
