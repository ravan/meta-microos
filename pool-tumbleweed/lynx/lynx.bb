SUMMARY = "A Text-Based WWW Browser"
DESCRIPTION = "Lynx is an easy-to-use browser for HTML documents and other Internet \
services like FTP, telnet, and news.  Lynx is fast.  It is purely text \
based and therefore makes it possible to use WWW resources on text \
terminals."
LICENSE = "GPL-2.0-only"

PV = "2.9.3"

RPM_NAME = "lynx-2.9.3-1.3.aarch64.rpm"
RPM_HASH = "788c8a157139a16e6dcd8d3d1df24a140753d4525c178e430accb676980d8e4dfff91b156eafd2c31684a6afafcb460d2f931cdb12f715b812e3790c4a9835a5"

RPROVIDES:${PN} += "config-lynx \
lynx \
web-browser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libncursesw.so.6 \
libssl.so.3 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
