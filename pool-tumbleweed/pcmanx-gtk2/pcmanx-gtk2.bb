SUMMARY = "User-friendly telnet client designed for BBS browsing"
DESCRIPTION = "An easy-to-use telnet client mainly targets BBS users. \
PCManX is a newly developed GPL'd version of PCMan, a full-featured famous BBS \
client formerly designed for MS Windows only. It aimed to be an easy-to-use yet \
full-featured telnet client facilitating BBS browsing with the ability to \
process double-byte characters."
LICENSE = "GPL-2.0+"

PV = "1.3"

RPM_NAME = "pcmanx-gtk2-1.3-1.43.aarch64.rpm"
RPM_HASH = "7cd93ac69e2c4b40d47c3ce4baa6f281f2e062cd08f369f2436748141fdfa2b552402d53001d398754eec7941587f4abe38f8c0b3a5be9bb76c42e07747a0e5c"

RPROVIDES:${PN} += "pcmanx-gtk2"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libltdl.so.7 \
libnotify.so.4 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
