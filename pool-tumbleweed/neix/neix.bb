SUMMARY = "News Reader for Text Terminals"
DESCRIPTION = "neix is a RSS/Atom news feed reader."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.5"

RPM_NAME = "neix-0.1.5-2.9.aarch64.rpm"
RPM_HASH = "64ddff33abcbe6a55e235c9431e105c67174f96c6cbe6f6ac91026290b9f42f8955556abef7aa94551046c8eafff8ceb72193d8a3ae2019577114f5fa6ea112e"

RPROVIDES:${PN} += "neix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
