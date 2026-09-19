SUMMARY = "Lynx-style Info Browser"
DESCRIPTION = "Pinfo is a curses based, Lynx-style info browser."
LICENSE = "GPL-2.0-only"

PV = "0.6.13"

RPM_NAME = "pinfo-0.6.13-2.19.aarch64.rpm"
RPM_HASH = "ab905e66f4c098ae5b4e730edf31630f9685836a16d4cb122be6cc1aa3ed96439816be96615aac418840559fb18e80e10e0a7ff5d62708ec5f2b79dac9852e3d"

RPROVIDES:${PN} += "config-pinfo \
pinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
