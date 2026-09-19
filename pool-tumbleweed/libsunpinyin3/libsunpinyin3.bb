SUMMARY = "Libraries for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "libsunpinyin3-2.0.99.2-3.6.aarch64.rpm"
RPM_HASH = "ac177221b7112b78ecab4080dcbc803617de2f40ecf8981ac9966c079563024628edf54f3b64a7c65f65f05be1ca9ef9da97ea94a2a9fa4f6ee76882538734f2"

RPROVIDES:${PN} += "libsunpinyin.so.3 \
libsunpinyin3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
sunpinyin-data"

inherit rpm
