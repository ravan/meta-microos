SUMMARY = "A Text Editor"
DESCRIPTION = "Joe is a powerful, easy to use, modeless text editor. It uses the same \
WordStar keybindings used in Borland's development environment."
LICENSE = "GPL-2.0-or-later"

PV = "4.6"

RPM_NAME = "joe-4.6-4.2.aarch64.rpm"
RPM_HASH = "d38dfca678e95aec9905e35ae71e896ceedb13a8e39c35b053a29411724786dc8302e124b2c095bcd984fe3a5dba5d82dfc8a7a3b1ac2fd24bf48aee87d73956"

RPROVIDES:${PN} += "config-joe \
joe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
