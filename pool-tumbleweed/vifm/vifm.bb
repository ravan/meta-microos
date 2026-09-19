SUMMARY = "Ncurses based file manager with vi like keybindings"
DESCRIPTION = "Vifm is a ncurses based file manager with vi like keybindings that allow complete \
keyboard control over your files without having to learn a new set of commands. \
It supports UTF-8, a quick file view similar to midnight commander's quick view, \
and configurable color schemes."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.4"

RPM_NAME = "vifm-0.14.4-2.1.aarch64.rpm"
RPM_HASH = "8bf4b8ae5daaa0962b2d246d5be4c10637daddc047ccc2585568e9a4599e5d5dd1cb27eff94bde7c8937300d5bd78c0ecd382d62d88719ac9a089ec3eed3efc9"

RPROVIDES:${PN} += "vifm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libmagic.so.1 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
