SUMMARY = "MATE Desktop terminal emulator"
DESCRIPTION = "MATE Terminal is a terminal emulation application that you can use \
to perform the following actions: \
 * Access a UNIX shell in the MATE environment. \
 * Run any application that is designed to run on VT102, VT220, and \
   xterm terminals."
LICENSE = "GPL-3.0-or-later"

PV = "1.28.1"

RPM_NAME = "mate-terminal-1.28.1-1.10.aarch64.rpm"
RPM_HASH = "dee5e1653ed1cb2970104c655b7ff321e6b5b7b9acadc8ffcc40ae7ab0df90d55a865c7f51aa3e81827faaa170f1c07297ec582ff248e8524366e0c37822ab02"

RPROVIDES:${PN} += "mate-terminal"

RDEPENDS:${PN} += "/usr/bin/perl \
gsettings-backend-dconf \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdconf.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libvte-2.91.so.0"

inherit rpm
