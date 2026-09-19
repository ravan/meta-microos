SUMMARY = "Multi-protocol extensible Chat Client"
DESCRIPTION = "WeeChat (Wee Enhanced Environment for Chat) is a free chat client, fast and light, designed for many operating systems. It is highly customizable and extensible with scripts. \
 \
Homepage: https://weechat.org/"
LICENSE = "GPL-3.0-or-later"

PV = "4.10.1"

RPM_NAME = "weechat-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "52baddaec734a173c960011636bf0e30e9e6ff941b75a10b49eda4afa7cd36f3099671388a9929cc7225cb9ea1e133b63f82ba97c8aee5afb29dc3a24dd935e5"

RPROVIDES:${PN} += "weechat"

RDEPENDS:${PN} += "ca-certificates \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcjson.so.1 \
libcurl.so.4 \
libgcrypt.so.20 \
libgnutls.so.30 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
