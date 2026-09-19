SUMMARY = "RSS/Atom Feed Reader for Text Terminals"
DESCRIPTION = "Newsboat is an RSS/Atom feedreader. RSS and Atom are a number of \
widely-used XML formats to transmit, publish and syndicate articles, \
for example news or blog articles. Newsboat is designed to be used on \
text terminals."
LICENSE = "MIT"

PV = "2.44"

RPM_NAME = "newsboat-2.44-1.2.aarch64.rpm"
RPM_HASH = "12f95498302149bc393e0a3a08da2d4a2f76f9c358d9e4d675b346ea44a062b739f43dd6a58e7482449e275253754e6fab810c6c96bee587411a51dd4b07a686"

RPROVIDES:${PN} += "newsbeuter \
newsboat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjson-c.so.5 \
libncursesw.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libstfl.so.0 \
libtinfo.so.6 \
libxml2.so.16"

inherit rpm
