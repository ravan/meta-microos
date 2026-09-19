SUMMARY = "A filemanager similar to XTree"
DESCRIPTION = "ytree is a (curses-based) file manager similar to DOS XTree."
LICENSE = "GPL-2.0-only"

PV = "2.13"

RPM_NAME = "ytree-2.13-1.3.aarch64.rpm"
RPM_HASH = "eceb65630849bb6b276cfc7235b0ea8ad2cb672d219c7a3c641fa98d03ff49a56488e4d5ee9a6cf77e8368b4769435e08f3da8e8f3367d0dadbf7887ce148afd"

RPROVIDES:${PN} += "ytree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
